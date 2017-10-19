Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=output.txt -Darg2=1
replace value for Darg2 with anything 0-4 for debugLevel.

-----------------------------------------------------------------------

## To create tarball for submission in directory before john_null_assign_3.
ant -buildfile src/build.xml tarzip or tar -zcvf john_null_assign_3.tar.gz john_null_assign_3

-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.”

[Date: 10/19/17]

-----------------------------------------------------------------------

Provide justification for Data Structures used in this assignment in
term of Big O complexity (time and/or space)
Not really applicable

-----------------------------------------------------------------------

Provide list of citations (urls, etc.) from where you have taken code
(if any).
