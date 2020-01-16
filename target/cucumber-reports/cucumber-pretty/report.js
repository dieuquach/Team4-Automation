$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/deleteCustomer.feature");
formatter.feature({
  "line": 1,
  "name": "Delete Customer",
  "description": "",
  "id": "delete-customer",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Delete Customer",
  "description": "",
  "id": "delete-customer;delete-customer",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#    When I type first name as \u003cfirstName\u003e"
    }
  ],
  "line": 8,
  "name": "I verify that system is already delete customer \u003cfirstName\u003e as \u003clastName\u003e as \u003cpostCode\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "delete-customer;delete-customer;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "postCode"
      ],
      "line": 11,
      "id": "delete-customer;delete-customer;;1"
    },
    {
      "cells": [
        "Harry",
        "Potter",
        "E725JB"
      ],
      "line": 12,
      "id": "delete-customer;delete-customer;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Open website https://www.way2automation.com/angularjs-protractor/banking/#/manager/list",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.way2automation.com/angularjs-protractor/banking/#/manager/list",
      "offset": 13
    }
  ],
  "location": "CommonTest.user_already_on_home_page(String)"
});
formatter.result({
  "duration": 4702709000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Delete Customer",
  "description": "",
  "id": "delete-customer;delete-customer;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#    When I type first name as \u003cfirstName\u003e"
    }
  ],
  "line": 8,
  "name": "I verify that system is already delete customer Harry as Potter as E725JB",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Harry",
      "offset": 48
    },
    {
      "val": "Potter",
      "offset": 57
    },
    {
      "val": "E725JB",
      "offset": 67
    }
  ],
  "location": "DeleteCustomerTest.deleteCustomerSuccessfully(String,String,String)"
});
formatter.result({
  "duration": 9613890600,
  "status": "passed"
});
});