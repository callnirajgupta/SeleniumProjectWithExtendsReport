$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/FeatureFile.feature");
formatter.feature({
  "line": 2,
  "name": "dfgfg",
  "description": "",
  "id": "dfgfg",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@feature"
    },
    {
      "line": 1,
      "name": "@regerssion"
    }
  ]
});
formatter.before({
  "duration": 2572008985,
  "status": "passed"
});
formatter.before({
  "duration": 52870,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "SCR001",
  "description": "",
  "id": "dfgfg;scr001",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user open the browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter userid and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify thta user is logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_open_the_browser_and_enter_url_as()"
});
formatter.write("I am insideSetup");
formatter.result({
  "duration": 10322955590,
  "error_message": "org.openqa.selenium.NoSuchSessionException: invalid session id\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SAI-PC\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.132, chrome: {chromedriverVersion: 75.0.3770.140 (2d9f97485c7b..., userDataDir: C:\\Users\\sai\\AppData\\Local\\...}, goog:chromeOptions: {debuggerAddress: localhost:55416}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: f2acaff5a7a9deab6b38211c5fbd4983\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:281)\r\n\tat com.manmohan.PageObject.Login.validateLoginPageTitle(Login.java:17)\r\n\tat com.manmohan.SampleSeleniumProject.StepDef.StepDefinition.user_open_the_browser_and_enter_url_as(StepDefinition.java:42)\r\n\tat ✽.Given user open the browser and enter url(src/test/resources/Feature/FeatureFile.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.user_enter_userid_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.verify_thta_user_is_logged_in_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("I am inside tear down");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 749397205,
  "status": "passed"
});
});