$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "HMS Login Feature",
  "description": "",
  "id": "hms-login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Important"
    }
  ]
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
  "name": "title login page HMS",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "user1",
        "user1"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.title_of_login_page_is_HMS()"
});
formatter.result({
  "duration": 6158951096,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 214126146,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 10672807101,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "HMS Registration Tests Scenario",
  "description": "",
  "id": "hms-login-feature;hms-registration-tests-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user clicks registration links",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.user_clicks_registration_link()"
});
formatter.result({
  "duration": 3977871154,
  "status": "passed"
});
formatter.after({
  "duration": 637885278,
  "status": "passed"
});
formatter.uri("Registration.feature");
formatter.feature({
  "line": 2,
  "name": "HMS Registration Feature",
  "description": "",
  "id": "hms-registration-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Important"
    }
  ]
});
formatter.scenarioOutline({
  "line": 12,
  "name": "HMS Registration Test Scenario",
  "description": "",
  "id": "hms-registration-feature;hms-registration-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user clicks registration links",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "hms-registration-feature;hms-registration-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 15,
      "id": "hms-registration-feature;hms-registration-test-scenario;;1"
    },
    {
      "cells": [
        "user1",
        "user1"
      ],
      "line": 16,
      "id": "hms-registration-feature;hms-registration-test-scenario;;2"
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
  "name": "title login page HMS",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "user1",
        "user1"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.title_of_login_page_is_HMS()"
});
formatter.result({
  "duration": 4072784344,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 299696428,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 11591766044,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "HMS Registration Test Scenario",
  "description": "",
  "id": "hms-registration-feature;hms-registration-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Important"
    },
    {
      "line": 11,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user clicks registration links",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.user_clicks_registration_link()"
});
formatter.result({
  "duration": 325936622,
  "status": "passed"
});
formatter.after({
  "duration": 633535812,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "HMS Permanent Registration",
  "description": "",
  "id": "hms-registration-feature;hms-permanent-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user clicks registration links",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "fill the registration form \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cdob\u003e\" and \"\u003cage\u003e\" and \"\u003cpanNo\u003e\" and \"\u003caddress1\u003e\" and \"\u003cmobileno\u003e\" and \"\u003czipcode\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "hms-registration-feature;hms-permanent-registration;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "dob",
        "age",
        "panNo",
        "address1",
        "mobileno",
        "zipcode"
      ],
      "line": 23,
      "id": "hms-registration-feature;hms-permanent-registration;;1"
    },
    {
      "cells": [
        "user1",
        "user1",
        "Rahul",
        "singh",
        "04-02-2009",
        "25",
        "APGPT4906H",
        "raheza plaza ghatkopar",
        "8801320960",
        "400806"
      ],
      "line": 24,
      "id": "hms-registration-feature;hms-permanent-registration;;2"
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
  "name": "title login page HMS",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "user1",
        "user1"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.title_of_login_page_is_HMS()"
});
formatter.result({
  "duration": 5442436440,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 158595386,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 7259706388,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "HMS Permanent Registration",
  "description": "",
  "id": "hms-registration-feature;hms-permanent-registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Important"
    },
    {
      "line": 18,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user clicks registration links",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "fill the registration form \"Rahul\" and \"singh\" and \"04-02-2009\" and \"25\" and \"APGPT4906H\" and \"raheza plaza ghatkopar\" and \"8801320960\" and \"400806\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.user_clicks_registration_link()"
});
formatter.result({
  "duration": 282577152,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rahul",
      "offset": 28
    },
    {
      "val": "singh",
      "offset": 40
    },
    {
      "val": "04-02-2009",
      "offset": 52
    },
    {
      "val": "25",
      "offset": 69
    },
    {
      "val": "APGPT4906H",
      "offset": 78
    },
    {
      "val": "raheza plaza ghatkopar",
      "offset": 95
    },
    {
      "val": "8801320960",
      "offset": 124
    },
    {
      "val": "400806",
      "offset": 141
    }
  ],
  "location": "RegistrationTest.fill_the_registration_form(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2597919575,
  "status": "passed"
});
formatter.after({
  "duration": 646379815,
  "status": "passed"
});
});