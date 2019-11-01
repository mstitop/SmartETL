/* Generated By:JavaCC: Do not edit this line. GeneratedFormulaParserConstants.java */
package org.pentaho.reporting.libraries.formula.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface GeneratedFormulaParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int WHITESPACE = 1;
  /** RegularExpression Id. */
  int LETTER = 3;
  /** RegularExpression Id. */
  int NON_ZERO_DIGIT = 4;
  /** RegularExpression Id. */
  int DIGIT = 5;
  /** RegularExpression Id. */
  int HEX_DIGIT = 6;
  /** RegularExpression Id. */
  int BINARY_DIGIT = 7;
  /** RegularExpression Id. */
  int UNSIGNED_INTEGER = 8;
  /** RegularExpression Id. */
  int EXPONENT_PART = 9;
  /** RegularExpression Id. */
  int NEWLINE = 10;
  /** RegularExpression Id. */
  int NONQUOTE_CHARACTER = 11;
  /** RegularExpression Id. */
  int NONQUOTE_LOOKUP = 12;
  /** RegularExpression Id. */
  int COMMA = 13;
  /** RegularExpression Id. */
  int PERIOD = 14;
  /** RegularExpression Id. */
  int COLON = 15;
  /** RegularExpression Id. */
  int QUOTE = 16;
  /** RegularExpression Id. */
  int DQUOTE = 17;
  /** RegularExpression Id. */
  int SEMICOLON = 18;
  /** RegularExpression Id. */
  int L_PAREN = 19;
  /** RegularExpression Id. */
  int R_PAREN = 20;
  /** RegularExpression Id. */
  int L_BRACKET = 21;
  /** RegularExpression Id. */
  int R_BRACKET = 22;
  /** RegularExpression Id. */
  int QUEST = 23;
  /** RegularExpression Id. */
  int L_BRACE = 24;
  /** RegularExpression Id. */
  int R_BRACE = 25;
  /** RegularExpression Id. */
  int PIPE = 26;
  /** RegularExpression Id. */
  int PLUS = 27;
  /** RegularExpression Id. */
  int MINUS = 28;
  /** RegularExpression Id. */
  int MULT = 29;
  /** RegularExpression Id. */
  int DIV = 30;
  /** RegularExpression Id. */
  int POW = 31;
  /** RegularExpression Id. */
  int EQUALS = 32;
  /** RegularExpression Id. */
  int NOT_EQUALS = 33;
  /** RegularExpression Id. */
  int LT_EQUALS = 34;
  /** RegularExpression Id. */
  int GT_EQUALS = 35;
  /** RegularExpression Id. */
  int LT = 36;
  /** RegularExpression Id. */
  int GT = 37;
  /** RegularExpression Id. */
  int CONCAT = 38;
  /** RegularExpression Id. */
  int AND = 39;
  /** RegularExpression Id. */
  int OR = 40;
  /** RegularExpression Id. */
  int NOT = 41;
  /** RegularExpression Id. */
  int PERCENT = 42;
  /** RegularExpression Id. */
  int IF = 43;
  /** RegularExpression Id. */
  int ELSE = 44;
  /** RegularExpression Id. */
  int THEN = 45;
  /** RegularExpression Id. */
  int END = 46;
  /** RegularExpression Id. */
  int NULL = 47;
  /** RegularExpression Id. */
  int IDENTIFIER = 48;
  /** RegularExpression Id. */
  int COLUMN_LOOKUP = 49;
  /** RegularExpression Id. */
  int STRING_LITERAL = 50;
  /** RegularExpression Id. */
  int UNSIGNED_NUMERIC_LITERAL = 51;
  /** RegularExpression Id. */
  int EXACT_NUMERIC_LITERAL = 52;
  /** RegularExpression Id. */
  int APPROXIMATE_NUMERIC_LITERAL = 53;
  /** RegularExpression Id. */
  int MANTISSA = 54;
  /** RegularExpression Id. */
  int SIGN = 55;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<WHITESPACE>",
    "<token of kind 2>",
    "<LETTER>",
    "<NON_ZERO_DIGIT>",
    "<DIGIT>",
    "<HEX_DIGIT>",
    "<BINARY_DIGIT>",
    "<UNSIGNED_INTEGER>",
    "<EXPONENT_PART>",
    "<NEWLINE>",
    "<NONQUOTE_CHARACTER>",
    "<NONQUOTE_LOOKUP>",
    "\",\"",
    "\".\"",
    "\":\"",
    "\"\\\'\"",
    "\"\\\"\"",
    "\";\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\"?\"",
    "\"{\"",
    "\"}\"",
    "\"|\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"^\"",
    "\"=\"",
    "\"<>\"",
    "\"<=\"",
    "\">=\"",
    "\"<\"",
    "\">\"",
    "\"&\"",
    "\"AND\"",
    "\"OR\"",
    "\"NOT\"",
    "\"%\"",
    "\"IF\"",
    "\"ELSE\"",
    "\"THEN\"",
    "\"END\"",
    "\"null\"",
    "<IDENTIFIER>",
    "<COLUMN_LOOKUP>",
    "<STRING_LITERAL>",
    "<UNSIGNED_NUMERIC_LITERAL>",
    "<EXACT_NUMERIC_LITERAL>",
    "<APPROXIMATE_NUMERIC_LITERAL>",
    "<MANTISSA>",
    "<SIGN>",
  };

}