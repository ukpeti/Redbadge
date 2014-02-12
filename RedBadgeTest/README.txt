Hi,

This is a quick solution for the Guardian registration problem, with a navigation example. I'm using pageobject pattern and factory pattern as well. It's in java, since in my workplace i'm not allowed to install visual studio, but in C# it would be like the same. For being able to test, you have to have installed Selenium library and JAVA.

In the test file:

https://github.com/ukpeti/Redbadge/tree/master/RedBadgeTest/src/com/diamant/guardiantests

YOu have to fill in these information. regX means this will be the registered username,password and the used email address. Goodemail and goodpassword should be a real, registered one. Bademail/password can be left as it is...

private String regUserName = "FILLIN";
private String regPassWord = "FILLIN";
private String regEmail = "FILLIN";
private String goodEmail = "FILLIN";
private String goodPassWord = "FILLIN";
private String badEmail = "FILLIN";
private String badPassWord = "FILLIN";

Of course these information could be gotten from file, xls etc. Its just a really quick solution. 

I created a navigation test as well, which shows how easy to use pageobject for test. If the navigation is not successful (the internet goes off during the test, or guardian site goes down..) then it will fail.

If its needed I can create it in C#, but we have a release week, so I got home in the last 2 days at 10:30pm.
