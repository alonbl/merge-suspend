@PLUGIN@ merge-suspend
===========================

NAME
----
@PLUGIN@ merge-suspend - Suspend merges.

SYNOPSIS
--------
>     ssh -p <port> <host> @PLUGIN@ merge-suspend

DESCRIPTION
-----------
Suspends all merges, will fail any attempt. Suspension
will be automatically ressumed once gerrit is restarted or
[[cmd-merge-resume]] command is executed.

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

>     $ ssh -p 29418 review.example.com @PLUGIN@ merge-suspend
