@PLUGIN@ merge-resume
===========================

NAME
----
@PLUGIN@ merge-resume - Suspend merges.

SYNOPSIS
--------
>     ssh -p <port> <host> @PLUGIN@ merge-resume

DESCRIPTION
-----------
Resumes merges.

ACCESS
------
Any user who has configured an SSH key and has been granted
the `Suspend merges` capability (provided by this plugin).

SCRIPTING
---------
This command is intended to be used in scripts.

EXAMPLES
--------

Have the server say hello to the administrator.

>     $ ssh -p 29418 review.example.com @PLUGIN@ merge-resume
