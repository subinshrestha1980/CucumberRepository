$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/bankncashpage.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Techfios Login Functionality",
  "description": "",
  "id": "validate-techfios-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BankLogin"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "1 User should be able to login with the valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-the-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks on the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should land on the Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User click in bank and cash",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on new account",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User fill the form entnering \"\u003caccountTitle\u003e\" and \"\u003cdiscription\u003e\" and \"\u003cinitalBalance\u003e\" and \"\u003caccountnumber\u003e\" and \"\u003ccontactPerson\u003e\" and \"\u003cphone\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User click in Submit Button",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-the-valid-credentials;",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "",
        "accountTitle",
        "",
        "discription",
        "",
        "initalBalance",
        "",
        "accountnumber",
        "",
        "contactPerson",
        "",
        "phone"
      ],
      "line": 18,
      "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-the-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "",
        "Larisha Shrestha5",
        "",
        "Personal Account",
        "",
        "USD 5000",
        "",
        "1382040",
        "",
        "Prajwalta Rajbhandari",
        "",
        "9779841657440"
      ],
      "line": 19,
      "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-the-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3715696200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.User_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 3712041900,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "1 User should be able to login with the valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-the-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@BankLogin"
    },
    {
      "line": 7,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks on the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should land on the Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User click in bank and cash",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on new account",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User fill the form entnering \"Larisha Shrestha5\" and \"Personal Account\" and \"USD 5000\" and \"1382040\" and \"Prajwalta Rajbhandari\" and \"9779841657440\"",
  "matchedColumns": [
    3,
    5,
    7,
    9,
    11,
    13
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User click in Submit Button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 13
    },
    {
      "val": "abc123",
      "offset": 37
    }
  ],
  "location": "StepDefinations.user_enters_and(String,String)"
});
formatter.result({
  "duration": 262487100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_clicks_on_the_signin_button()"
});
formatter.result({
  "duration": 6589554700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_should_land_on_the_Dashboard_page()"
});
formatter.result({
  "duration": 345746700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_click_in_bank_and_cash()"
});
formatter.result({
  "duration": 84625800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_click_on_new_account()"
});
formatter.result({
  "duration": 566916900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Larisha Shrestha5",
      "offset": 30
    },
    {
      "val": "Personal Account",
      "offset": 54
    },
    {
      "val": "USD 5000",
      "offset": 77
    },
    {
      "val": "1382040",
      "offset": 92
    },
    {
      "val": "Prajwalta Rajbhandari",
      "offset": 106
    },
    {
      "val": "9779841657440",
      "offset": 134
    }
  ],
  "location": "StepDefinations.user_fill_the_form_entnering_and_and_and_and_and(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 7712246500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_click_in_Submit_Button()"
});
formatter.result({
  "duration": 1009411200,
  "status": "passed"
});
});