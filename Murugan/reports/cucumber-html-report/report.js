$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/Test.feature");
formatter.feature({
  "line": 2,
  "name": "SauceDemo_Website",
  "description": "",
  "id": "saucedemo-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SauceDemo"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "view the about us in company field",
  "description": "",
  "id": "saucedemo-website;view-the-about-us-in-company-field",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Select_the_company_field_in_about_option"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The user login the home page using \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "check about us in company field",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "saucedemo-website;view-the-about-us-in-company-field;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "saucedemo-website;view-the-about-us-in-company-field;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 15,
      "id": "saucedemo-website;view-the-about-us-in-company-field;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "view the about us in company field",
  "description": "",
  "id": "saucedemo-website;view-the-about-us-in-company-field;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Select_the_company_field_in_about_option"
    },
    {
      "line": 1,
      "name": "@SauceDemo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The user login the home page using \"standard_user\" and \"secret_sauce\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "check about us in company field",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_aboutus_stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 9713629327,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_aboutus_stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 6243354687,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 36
    },
    {
      "val": "secret_sauce",
      "offset": 56
    }
  ],
  "location": "Sauce_demo_aboutus_stepdefinition.the_user_login_the_home_page_using_and(String,String)"
});
formatter.result({
  "duration": 19025282466,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_aboutus_stepdefinition.check_about_us_in_company_field()"
});
formatter.result({
  "duration": 33192583201,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_aboutus_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 4683507958,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "checking company news in company field",
  "description": "",
  "id": "saucedemo-website;checking-company-news-in-company-field",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@TC02_Search_latest_company_news_in_companyfield"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "the user launching the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "the users open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "The user logins the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "check company news in company field",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_companynews_stepdefinition.the_user_launching_the_chrome_application()"
});
formatter.result({
  "duration": 5305412386,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_companynews_stepdefinition.the_users_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 3896092955,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_companynews_stepdefinition.the_user_logins_the_home_page()"
});
formatter.result({
  "duration": 15792743998,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_companynews_stepdefinition.check_company_news_in_company_field()"
});
formatter.result({
  "duration": 22571449404,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_companynews_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 3071089320,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "checking valid details in company field",
  "description": "",
  "id": "saucedemo-website;checking-valid-details-in-company-field",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@TC03_valid_partnership_details_in_the_company_field"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user login the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "check valid partnership details in the company field",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "closing the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_validcontact_stepdefinition.user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 6616480494,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_validcontact_stepdefinition.user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 3818668372,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_validcontact_stepdefinition.user_login_the_home_page()"
});
formatter.result({
  "duration": 8332189930,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_validcontact_stepdefinition.check_valid_partnership_details_in_the_company_field()"
});
formatter.result({
  "duration": 52313215357,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_validcontact_stepdefinition.closing_the_browser()"
});
formatter.result({
  "duration": 3074241984,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "checking invalid partnership details in company field",
  "description": "",
  "id": "saucedemo-website;checking-invalid-partnership-details-in-company-field",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@TC04_Invalid_partnership_details_in_the_company_field"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "user launching the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "user opens the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user logins the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "check Invalid partnership details in the company field",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Closing the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_invalidcontact_stepdefinition.user_launching_the_chrome_application()"
});
formatter.result({
  "duration": 7416110147,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_invalidcontact_stepdefinition.user_opens_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 6878648528,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_invalidcontact_stepdefinition.user_logins_the_home_page()"
});
formatter.result({
  "duration": 13240917489,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_invalidcontact_stepdefinition.check_Invalid_partnership_details_in_the_company_field()"
});
formatter.result({
  "duration": 51877413465,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_invalidcontact_stepdefinition.closing_the_browser()"
});
formatter.result({
  "duration": 3067277214,
  "status": "passed"
});
});