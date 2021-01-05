# ooad-api

API for calculating boolean expressions containing:
 - operands, denoted as **X1**, **X2**, **X3** etc.
 - boolean expressions: **AND**, **OR**, **NOT**
 
To be calculated, a boolean expression must be input using prefix notation. Examples:

 - **X1 AND !(X2 OR X3)** will be written in prefix notation as: **(AND, X1, NOT, OR, X2, X3)**
 - **!X1 OR !X2** will be written as: **(OR, NOT, X1, NOT, X2)**
 
 