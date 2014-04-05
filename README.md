# What is RoboBook

RoboBook is a mock application which was designed to illustrate automation testing.

It is a social network for robots. Robots and androids can register, make connections and keep in touch with each other. :)

# Set up calabash console

You need to have `calabash-android` installed on your machine and you need to connect one and only one phone (tablet, emulator).

1. Download the apk (application file) from [here](https://github.com/balazsbalazs/robobook/releases/download/v1.0/robobook.apk) and save it somewhere on your machine. (eg. `~/robobook/robobook.apk`

2. Open a terminal (command line) and navigate to the directory where you saved the application. (eg. `cd ~/robobook`)

3. Type in the following command to build the test server:

  ```calabash-android build robobook.apk```
4. Type in the following command to start the console:

  ```calabash-android console robobook.apk```
  
  If everything went well you're in the calabash console and you see a prompt like this:
  
  ```irb(main):001:0>```

5. Enter the following command into the calabash console to install the app:

  ```irb(main):001:0> reinstall_apps```

6. Enter the following command into the calabash console to start the test app:

  ```irb(main):002:0> start_test_server_in_background```

  The app should start on your phone and you should see a login screen.

