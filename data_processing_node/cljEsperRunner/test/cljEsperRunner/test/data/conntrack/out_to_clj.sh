#/bin/bash
# Script to convert "raw" data gathered with cljNetPcap using the combined-output fn to a "usable" *.clj file.
#
# Usage:
# out_to_clj.sh <INPUT> <DESCRIPTION> [<NAME> [<DATE>]]
#
# When no date is given the current date is used.
#

INPUT="$1"
NAME="$(echo "$INPUT" | head -c -5)"
TEMP="$NAME.tmp"
HEADER_TEMP="${NAME}_header.tmp"

DESCRIPTION="$2"

if [ "$3" == "" ]
then
  OUTPUT_NAME=$(echo "$NAME" | sed "s/_/-/g")
else
  OUTPUT_NAME=$(echo "$3" | sed "s/_/-/g")
fi
OUTPUT_FILE="$(echo "$OUTPUT_NAME" | sed "s/-/_/g").clj"

if [ "$4" == "" ]
then
  DATE=$(date +"%Y-%m-%d")
else
  DATE="$4"
fi


function colorize_output(){
  COMMAND_OUTPUT=$("$@")
  if [ $? -eq 0 ]
  then
    echo -e "\E[42m[OK]\E[0m" 
  else
    echo -e "\E[41m[FAILED]\E[0m" 
  fi
}

function colorize_output_short(){
  COMMAND_OUTPUT=$("$@")
  if [ $? -eq 0 ]
  then
    echo -ne "\E[42m.\E[0m" 
  else
    echo -ne "\E[41m!\E[0m" 
  fi
}

echo -e "Starting conversion from *.out to *.clj.\n\n"

echo "Using output name: $OUTPUT_NAME"
echo "Using date: $DATE"
echo -e "Description: $DESCRIPTION\n\n"

echo -ne "Creating temp file for: $INPUT\t\t"
colorize_output cp -f "$INPUT" "$TEMP"
echo -e "Temp file: $TEMP\n"

echo -ne "Removing status output.\t\t"
colorize_output_short sed -i '/^Starting*/d' "$TEMP"
colorize_output_short sed -i '/^{:url*/d' "$TEMP"
colorize_output_short sed -i '/^ :queue*/d' "$TEMP"
colorize_output_short sed -i '/^ :stdout*/d' "$TEMP"
colorize_output_short sed -i '/^ :nojms*/d' "$TEMP"
colorize_output_short sed -i '/^ :help*/d' "$TEMP"
colorize_output_short sed -i '/^\[\]*/d' "$TEMP"
colorize_output_short sed -i '/^cljConntrackProducer*/d' "$TEMP"
colorize_output sed -i '/^Type*/d' "$TEMP"
echo ""

echo -ne "Preparing file header.\t\t"
cat > "$HEADER_TEMP" <<END_OF_HEADER
;;;
;;;   Copyright 2012, University of Applied Sciences Frankfurt am Main
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns 
  ^{:author "Ruediger Gad",
    :doc "Sample data",
    :description "%DESCRIPTION"
    :raw-file "%RAW"
    :date "%DATE"}
   cljEsperRunner.test.data.conntrack.%NAME)

(def data-set [
END_OF_HEADER
colorize_output_short sed -i "s/%DATE/$DATE/" "$HEADER_TEMP"
colorize_output_short sed -i "s/%NAME/$OUTPUT_NAME/" "$HEADER_TEMP"
colorize_output_short sed -i "s/%RAW/$INPUT/" "$HEADER_TEMP"
colorize_output sed -i "s/%DESCRIPTION/$DESCRIPTION/" "$HEADER_TEMP"
echo ""

echo -ne "Creating $OUTPUT_FILE.\t\t"
cat "$HEADER_TEMP" "$TEMP" > "$OUTPUT_FILE"
echo "])" >> "$OUTPUT_FILE"
echo -e "\n"

echo -ne "Removing temporary files.\t\t"
colorize_output_short rm "$HEADER_TEMP"
colorize_output rm "$TEMP"
echo ""

echo "Conversion from *.out to *.clj finished."

