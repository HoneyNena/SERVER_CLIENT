
New Relic Java Agent
--------------------
New Relic is an application performance monitoring (APM) service that lets
you see and understand application performance metrics in real time so you
can fix problems fast.  The Java agent collects system and application
metrics by injecting bytecode into a select set of methods. The metrics are
reported to the New Relic service once a minute. The agent also reports
uncaught exceptions and slow transactions.

The Java Agent installs into your app server and monitors the performance
of your apps.  The agent monitors applications written in Java, Scala, and
other languages that run on the JVM.  New Relic provides additional detail
for many common frameworks and libraries. See this page for details:

  http://newrelic.com/java


Getting Started
---------------
If you don't already have a New Relic account, sign up for a free account:

  https://newrelic.com/signup

When you sign up, you will be provided with a customized zip file that is
configured with your license key.

Using Java SE 5? You will need a different version of the agent. See below.


Installation
------------
Complete installation instructions and troubleshooting tips are available 
at:

  https://newrelic.com/docs/java/new-relic-for-java

For most users, the following self-installer instructions apply:

  https://newrelic.com/docs/java/java-agent-self-installer

Configuration options are available at:

  https://newrelic.com/docs/java/java-agent-configuration


Using New Relic
---------------
Once you have installed the agent and restarted your app server, you can
login to New Relic at

  https://rpm.newrelic.com

and see your application's performance information. It takes about two
minutes for the application data to show up. By default, your data will
appear under an application named "My Application". You can change this by
updating the app_name setting in newrelic.yml (see below).


Agent Files
-----------
Typically, you will unzip the newrelic files in your app server root. The
layout is:

  newrelic/
    newrelic.jar
    newrelic-api.jar
    newrelic.yml
    logs/
      ...

The installation process adds a JVM argument
  -javaagent:newrelic/newrelic.jar
to your app server startup script.

The newrelic.yml file provides configuration options. Most of the options
take effect on restart of the app server. NOTE: yml requires exact
whitespace indentation! If the indentation is incorrect, the option may be
ignored.

The logs directory contains important diagnostic information about the
agent. In particular, view newrelic/logs/newrelic_agent.log if you are
troubleshooting.
