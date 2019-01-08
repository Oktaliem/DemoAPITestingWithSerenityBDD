# DemoAPITestingWithSerenityBDD
REST API Testing with SerenityBDD + REST Assured example

## Run the Test Via Command Line
Check your TestRunner folder for cucumber options

i.e. 
```
- mvn clean verify
- mvn clean verify -Dit.test=com.restapi.github.features.* -Dtags=API:PaymentAPI -Dskip-test=true
```

## SerenityBDD HTML Report Path
```
{your_project_path}/target/site/serenity/index.html
```

Sample 1 :
![serenity bdd rest assured html report 1](https://user-images.githubusercontent.com/26521948/50804702-34fc1280-132a-11e9-99ba-6c579ba63ad6.png)

Sample 2 :
![serenity bdd rest assured html report 2](https://user-images.githubusercontent.com/26521948/50804791-82787f80-132a-11e9-99cd-d7e70370c2b0.png)

Sample 3 :
![serenity bdd rest assured html report 3](https://user-images.githubusercontent.com/26521948/50804704-3594a900-132a-11e9-9875-7d1c767c4f3e.png)

## Serenity BDD Testing Log

<details>
<summary>
CLICK ME
</summary>
<p>
 
```maven
C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD>mvn clean verify -Dit.test=com.restapi.github.features.* -Dtags=API:PaymentAPI -Dskip-test=true
[INFO] Scanning for projects...
[WARNING]
[WARNING] Some problems were encountered while building the effective model for DemoAPITestingWithSerenityBDD:DemoAPITestingWithSerenityBDD:jar:1.0-SNAPSHOT
[WARNING] 'dependencies.dependency.(groupId:artifactId:type:classifier)' must be unique: junit:junit:jar -> duplicate declaration of version 4.12 @ line 118, column 21
[WARNING] 'dependencies.dependency.(groupId:artifactId:type:classifier)' must be unique: org.assertj:assertj-core:jar -> version 3.6.2 vs 3.1.0 @ line 128, column 21
[WARNING] 'dependencies.dependency.version' for com.applitools:eyes-selenium-java3:jar is either LATEST or RELEASE (both of them are being deprecated) @ line 193, column 22
[WARNING]
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING]
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING]
[INFO]
[INFO] ----< DemoAPITestingWithSerenityBDD:DemoAPITestingWithSerenityBDD >-----
[INFO] Building Sample Serenity BDD project using REST Assured 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[WARNING] The artifact jexcelapi:jxl:jar:2.6 has been relocated to net.sourceforge.jexcelapi:jxl:jar:2.6
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ DemoAPITestingWithSerenityBDD ---
[INFO] Deleting C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\target
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ DemoAPITestingWithSerenityBDD ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ DemoAPITestingWithSerenityBDD ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ DemoAPITestingWithSerenityBDD ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ DemoAPITestingWithSerenityBDD ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 17 source files to C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ DemoAPITestingWithSerenityBDD ---
[INFO] Tests are skipped.
[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ DemoAPITestingWithSerenityBDD ---
[INFO] Building jar: C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\target\DemoAPITestingWithSerenityBDD-1.0-SNAPSHOT.jar
[INFO]
[INFO] --- maven-failsafe-plugin:2.18.1:integration-test (default) @ DemoAPITestingWithSerenityBDD ---
[WARNING] The parameter forkMode is deprecated since version 2.14. Use forkCount and reuseForks instead.
[WARNING] useSystemClassloader setting has no effect when not forking
[INFO] Failsafe report directory: C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\target\failsafe-reports
SLF4J: Class path contains multiple SLF4J bindings.
SLF4J: Found binding in [jar:file:/C:/Users/User/.m2/repository/ch/qos/logback/logback-classic/1.0.13/logback-classic-1.0.13.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: Found binding in [jar:file:/C:/Users/User/.m2/repository/org/slf4j/slf4j-simple/1.7.12/slf4j-simple-1.7.12.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.
SLF4J: Actual binding is of type [ch.qos.logback.classic.util.ContextSelectorStaticBinder]
08:10:54.449 [main] DEBUG n.t.c.u.PropertiesFileLocalPreferences - LOADING LOCAL PROPERTIES FROM C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\serenity.properties
08:10:54.453 [main] DEBUG n.t.c.u.PropertiesFileLocalPreferences - LOADING LOCAL PROPERTIES FROM C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\serenity.properties
08:10:54.453 [main] DEBUG n.t.c.u.PropertiesFileLocalPreferences - LOADING LOCAL PROPERTIES FROM C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\serenity.properties
08:10:54.465 [main] DEBUG n.t.c.u.PropertiesFileLocalPreferences - api.key=NNknn2njpkADyNQ3F7bTkovqXyLPaKKFe
08:10:54.465 [main] DEBUG n.t.c.u.PropertiesFileLocalPreferences - api.url=http://localhost/payments
Running com.restapi.github.features.GetVoidPayment
08:10:54.672 [main] INFO  net.serenitybdd.core.Serenity -

-------------------------------------------------------------------------------------
     _______. _______ .______       _______ .__   __.  __  .___________.____    ____
    /       ||   ____||   _  \     |   ____||  \ |  | |  | |           |\   \  /   /
   |   (----`|  |__   |  |_)  |    |  |__   |   \|  | |  | `---|  |----` \   \/   /
    \   \    |   __|  |      /     |   __|  |  . `  | |  |     |  |       \_    _/
.----)   |   |  |____ |  |\  \----.|  |____ |  |\   | |  |     |  |         |  |
|_______/    |_______|| _| `._____||_______||__| \__| |__|     |__|         |__|

 News and tutorials at http://www.serenity-bdd.info
 Documentation at https://wakaleo.gitbooks.io/the-serenity-book/content/
 Join the Serenity Community on Rocket Chat at https://serenity-bdd.rocket.chat
 Serenity BDD Support and Training at http://serenity-bdd.info/#/trainingandsupport
 Learn Serenity BDD online at http://serenity-dojo.com
-------------------------------------------------------------------------------------

08:10:55.230 [main] DEBUG n.t.c.u.PropertiesFileLocalPreferences - LOADING LOCAL PROPERTIES FROM C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\serenity.properties
08:10:55.231 [main] DEBUG n.t.c.u.PropertiesFileLocalPreferences - LOADING LOCAL PROPERTIES FROM C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\serenity.properties
08:10:55.232 [main] DEBUG n.t.c.u.PropertiesFileLocalPreferences - LOADING LOCAL PROPERTIES FROM C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\serenity.properties
08:10:55.239 [main] DEBUG n.t.c.u.PropertiesFileLocalPreferences - api.key=NNknn2njpkADyNQ3F7bTkovqXyLPaKKFe
08:10:55.239 [main] DEBUG n.t.c.u.PropertiesFileLocalPreferences - api.url=http://localhost/payments
08:10:55.334 [main] DEBUG n.thucydides.core.steps.StepEventBus - Test suite started for class com.restapi.github.features.GetVoidPayment
08:10:55.341 [main] INFO  net.serenitybdd.core.Serenity - Test Suite Started: Get void payment
08:10:55.470 [main] INFO  net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: ableToGetVoidPaymentListSuccessfully
-------------------------------------------------------------------
08:10:55.481 [main] INFO  net.serenitybdd.core.Serenity - TEST NUMBER: 1
08:10:55.722 [main] DEBUG n.t.core.steps.StepInterceptor - STARTING STEP: GetVoidPayment.ableToGetVoidPaymentListSuccessfully - ableToGetVoidPaymentListSuccessfully
Request method: GET
Request URI:    http://localhost/payments/get/void
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    <none>
Path params:    <none>
Headers:                Api-Key=NNknn2njpkADyNQ3F7bTkovqXyLPaKKFe
                                Accept=*/*
                                Content-Type=application/json; charset=UTF-8
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 200 OK
X-Powered-By: Express
Content-Type: application/json; charset=utf-8
Content-Length: 25193
ETag: W/"6269-pCaVCy1XMTid3scNyxojmOWLpDs"
Date: Tue, 08 Jan 2019 00:11:00 GMT
Connection: keep-alive

[
    {
        "_id": "5ac3ad01409b7c5f1337e7db",
        "transaction_id": "12k33456",
        "original_currency_code": "SGD",
        "original_amount": "20",
        "exchange_rate": "1",
        "final_currecy_code": "SDG",
        "final_amount": "20",
        "__v": 0
    },
    {
        "_id": "5ac3bcc94c5c5260d525adea",
        "transaction_id": "12k33456",
        "original_currency_code": "SGD",
        "original_amount": "20",
        "exchange_rate": "1",
        "final_currecy_code": "SDG",
        "final_amount": "20",
        "__v": 0
    },
    {
        "_id": "5ac3bd354c5c5260d525adeb",
        "original_currency_code": "SGD",
        "original_amount": "20",
        "exchange_rate": "1",
        "final_currecy_code": "SDG",
        "final_amount": "20",
        "__v": 0
    }
	}
]
08:11:03.467 [main] DEBUG n.t.core.steps.StepInterceptor - STEP DONE: ableToGetVoidPaymentListSuccessfully
08:11:03.500 [main] INFO  net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Able to get void payment list successfully
----------------------------------------------------------------------------
08:11:03.516 [main] DEBUG n.t.core.reports.ReportService - Reporting formats: [JSON, HTML]
08:11:03.521 [main] DEBUG n.t.core.reports.ReportService - Found reporter: net.thucydides.core.reports.xml.XMLTestOutcomeReporter@2c75b0c8(format = Optional[XML])
08:11:03.522 [main] DEBUG n.t.core.reports.ReportService - Found reporter: net.thucydides.core.reports.json.JSONTestOutcomeReporter@23c95292(format = Optional[JSON])
08:11:03.523 [main] DEBUG n.t.core.reports.ReportService - Registering reporter: net.thucydides.core.reports.json.JSONTestOutcomeReporter@23c95292
08:11:03.591 [main] DEBUG n.t.core.reports.ReportService - Found reporter: net.thucydides.core.reports.html.HtmlAcceptanceTestReporter@79dcd7f1(format = Optional[HTML])
08:11:03.592 [main] DEBUG n.t.core.reports.ReportService - Registering reporter: net.thucydides.core.reports.html.HtmlAcceptanceTestReporter@79dcd7f1
08:11:03.593 [main] DEBUG n.t.core.reports.ReportService - Reporting formats: [JSON, HTML]
08:11:03.614 [main] DEBUG n.t.core.reports.ReportService - Generating reports for 1 test outcomes using: net.thucydides.core.reports.json.JSONTestOutcomeReporter@23c95292
08:11:03.616 [main] DEBUG n.t.c.r.j.JUnitXMLOutcomeReporter - GENERATING JUNIT REPORTS
08:11:03.616 [pool-1-thread-1] DEBUG n.t.core.reports.ReportService - Processing test outcome Get void payment:ableToGetVoidPaymentListSuccessfully
08:11:03.617 [pool-1-thread-1] DEBUG n.t.core.reports.ReportService - net.thucydides.core.reports.json.JSONTestOutcomeReporter@23c95292: Generating report for test outcome: Get void payment:ableToGetVoidPaymentListSuccessfully
08:11:03.629 [pool-1-thread-1] DEBUG n.t.c.r.json.JSONTestOutcomeReporter - Generating JSON report for Able to get void payment list successfully to file C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\target\site\serenity\6c245075971a19f5b7578b13616be00a174754531156ab665402b6b7d7389bb5.json (using temp file C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\target\site\serenity\6c245075971a19f5b7578b13616be00a174754531156ab665402b6b7d7389bb5.json3c9ead1f-14b4-4234-b183-405327d69bb8)
08:11:03.732 [pool-1-thread-1] DEBUG n.t.core.reports.ReportService - Processing test outcome Get void payment:ableToGetVoidPaymentListSuccessfully done
08:11:03.869 [main] DEBUG n.t.core.reports.ReportService - Shutting down executor service
08:11:03.869 [main] DEBUG n.t.core.reports.ReportService - Reports generated in: 254 ms
08:11:03.871 [main] DEBUG n.t.core.reports.ReportService - Generating reports for 1 test outcomes using: net.thucydides.core.reports.html.HtmlAcceptanceTestReporter@79dcd7f1
08:11:03.874 [main] DEBUG n.t.c.r.j.JUnitXMLOutcomeReporter - GENERATING JUNIT REPORTS
08:11:03.875 [pool-2-thread-1] DEBUG n.t.core.reports.ReportService - Processing test outcome Get void payment:ableToGetVoidPaymentListSuccessfully
08:11:03.876 [pool-2-thread-1] DEBUG n.t.core.reports.ReportService - net.thucydides.core.reports.html.HtmlAcceptanceTestReporter@79dcd7f1: Generating report for test outcome: Get void payment:ableToGetVoidPaymentListSuccessfully
08:11:03.877 [pool-2-thread-1] DEBUG n.t.c.r.h.HtmlAcceptanceTestReporter - GENERATE TEST OUTCOME REPORT FOR ableToGetVoidPaymentListSuccessfully in 6c245075971a19f5b7578b13616be00a174754531156ab665402b6b7d7389bb5
08:11:03.891 [pool-2-thread-1] DEBUG n.t.c.r.RequirementsTagProvider - Requirements found:[]
08:11:03.964 [pool-2-thread-1] DEBUG n.t.c.r.h.HtmlAcceptanceTestReporter - GENERATING HTML REPORT FOR Get void payment:ableToGetVoidPaymentListSuccessfully in 6c245075971a19f5b7578b13616be00a174754531156ab665402b6b7d7389bb5.html in directory target\site\serenity
08:11:07.333 [pool-2-thread-1] DEBUG n.t.c.r.h.HtmlAcceptanceTestReporter - Generating report in 6c245075971a19f5b7578b13616be00a174754531156ab665402b6b7d7389bb5.html
08:11:07.654 [pool-2-thread-1] DEBUG n.t.c.r.RequirementsTagProvider - Requirements found:[]
08:11:07.682 [pool-2-thread-1] DEBUG n.t.c.r.RequirementsTagProvider - Requirements found:[]
08:11:07.687 [pool-2-thread-1] DEBUG n.t.c.r.RequirementsTagProvider - Requirements found:[]
08:11:07.776 [pool-2-thread-1] DEBUG n.t.c.r.h.HtmlAcceptanceTestReporter - Generated report 6c245075971a19f5b7578b13616be00a174754531156ab665402b6b7d7389bb5.html in 443 ms
08:11:07.777 [pool-2-thread-1] DEBUG n.t.core.reports.ReportService - Processing test outcome Get void payment:ableToGetVoidPaymentListSuccessfully done
08:11:07.778 [main] DEBUG n.t.core.reports.ReportService - Shutting down executor service
08:11:07.778 [main] DEBUG n.t.core.reports.ReportService - Reports generated in: 3904 ms
08:11:07.797 [main] DEBUG n.t.core.reports.ReportService - Generating report for configuration
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 13.175 sec - in com.restapi.github.features.GetVoidPayment
Running com.restapi.github.features.PostVoidPayment
08:11:07.878 [main] DEBUG n.thucydides.core.steps.StepEventBus - Test suite started for class com.restapi.github.features.PostVoidPayment
08:11:07.879 [main] INFO  net.serenitybdd.core.Serenity - Test Suite Started: Post void payment
08:11:07.881 [main] INFO  net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: ableToPostVoidPaymentListSuccessfully
-------------------------------------------------------------------
08:11:07.901 [main] INFO  net.serenitybdd.core.Serenity - TEST NUMBER: 2
08:11:07.904 [main] DEBUG n.t.core.steps.StepInterceptor - STARTING STEP: PostVoidPayment.ableToPostVoidPaymentListSuccessfully - ableToPostVoidPaymentSuccessfully
Okta Liem Message Conditional 3 : exchange_rate
Okta Liem Message Conditional 3 : transaction_id
Okta Liem Message Conditional 3 : original_amount
Okta Liem Message Conditional 3 : original_currency_code
Okta Liem Message Conditional 3 : final_amount
Okta Liem Message Conditional 3 : final_currecy_code
Request method: POST
Request URI:    http://localhost/payments/post/void
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    <none>
Path params:    <none>
Headers:                Api-Key=NNknn2njpkADyNQ3F7bTkovqXyLPaKKFe
                                Accept=*/*
                                Content-Type=application/json; charset=UTF-8
Cookies:                <none>
Multiparts:             <none>
Body:
{
    "exchange_rate": "1",
    "transaction_id": "12k33456",
    "original_amount": "20",
    "original_currency_code": "IDR",
    "final_amount": "20",
    "final_currecy_code": "IDR"
}
HTTP/1.1 200 OK
X-Powered-By: Express
Content-Type: application/json; charset=utf-8
Content-Length: 61
ETag: W/"3d-WCxem0XYEqnGO7Hnj6U/q8f3oys"
Date: Tue, 08 Jan 2019 00:11:08 GMT
Connection: keep-alive

{
    "action_code": "0",
    "reason": "Transaction voided succesfully"
}
08:11:08.074 [main] DEBUG n.t.core.steps.StepInterceptor - STEP DONE: ableToPostVoidPaymentSuccessfully
08:11:08.078 [main] INFO  net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Able to post void payment list successfully
----------------------------------------------------------------------------
08:11:08.095 [main] DEBUG n.t.core.reports.ReportService - Reporting formats: [JSON, HTML]
08:11:08.097 [main] DEBUG n.t.core.reports.ReportService - Found reporter: net.thucydides.core.reports.xml.XMLTestOutcomeReporter@5a59f3d9(format = Optional[XML])
08:11:08.100 [main] DEBUG n.t.core.reports.ReportService - Found reporter: net.thucydides.core.reports.json.JSONTestOutcomeReporter@9cdceeb(format = Optional[JSON])
08:11:08.104 [main] DEBUG n.t.core.reports.ReportService - Registering reporter: net.thucydides.core.reports.json.JSONTestOutcomeReporter@9cdceeb
08:11:08.106 [main] DEBUG n.t.core.reports.ReportService - Found reporter: net.thucydides.core.reports.html.HtmlAcceptanceTestReporter@591b8f15(format = Optional[HTML])
08:11:08.107 [main] DEBUG n.t.core.reports.ReportService - Registering reporter: net.thucydides.core.reports.html.HtmlAcceptanceTestReporter@591b8f15
08:11:08.111 [main] DEBUG n.t.core.reports.ReportService - Reporting formats: [JSON, HTML]
08:11:08.112 [main] DEBUG n.t.core.reports.ReportService - Generating reports for 1 test outcomes using: net.thucydides.core.reports.json.JSONTestOutcomeReporter@9cdceeb
08:11:08.115 [main] DEBUG n.t.c.r.j.JUnitXMLOutcomeReporter - GENERATING JUNIT REPORTS
08:11:08.117 [pool-3-thread-1] DEBUG n.t.core.reports.ReportService - Processing test outcome Post void payment:ableToPostVoidPaymentListSuccessfully
08:11:08.122 [pool-3-thread-1] DEBUG n.t.core.reports.ReportService - net.thucydides.core.reports.json.JSONTestOutcomeReporter@9cdceeb: Generating report for test outcome: Post void payment:ableToPostVoidPaymentListSuccessfully
08:11:08.128 [pool-3-thread-1] DEBUG n.t.c.r.json.JSONTestOutcomeReporter - Generating JSON report for Able to post void payment list successfully to file C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\target\site\serenity\af6eb7982d95528e41f62e529faa2a5da7b2bd4c61c517b879fdb35b48fcdae5.json (using temp file C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\target\site\serenity\af6eb7982d95528e41f62e529faa2a5da7b2bd4c61c517b879fdb35b48fcdae5.json0e163d69-06a4-4dc1-9af4-e3bb9bef9750)
08:11:08.152 [pool-3-thread-1] DEBUG n.t.core.reports.ReportService - Processing test outcome Post void payment:ableToPostVoidPaymentListSuccessfully done
08:11:08.154 [main] DEBUG n.t.core.reports.ReportService - Shutting down executor service
08:11:08.155 [main] DEBUG n.t.core.reports.ReportService - Reports generated in: 40 ms
08:11:08.157 [main] DEBUG n.t.core.reports.ReportService - Generating reports for 1 test outcomes using: net.thucydides.core.reports.html.HtmlAcceptanceTestReporter@591b8f15
08:11:08.158 [main] DEBUG n.t.c.r.j.JUnitXMLOutcomeReporter - GENERATING JUNIT REPORTS
08:11:08.161 [pool-4-thread-1] DEBUG n.t.core.reports.ReportService - Processing test outcome Post void payment:ableToPostVoidPaymentListSuccessfully
08:11:08.162 [pool-4-thread-1] DEBUG n.t.core.reports.ReportService - net.thucydides.core.reports.html.HtmlAcceptanceTestReporter@591b8f15: Generating report for test outcome: Post void payment:ableToPostVoidPaymentListSuccessfully
08:11:08.164 [pool-4-thread-1] DEBUG n.t.c.r.h.HtmlAcceptanceTestReporter - GENERATE TEST OUTCOME REPORT FOR ableToPostVoidPaymentListSuccessfully in af6eb7982d95528e41f62e529faa2a5da7b2bd4c61c517b879fdb35b48fcdae5
08:11:08.164 [pool-4-thread-1] DEBUG n.t.c.r.RequirementsTagProvider - Requirements found:[]
08:11:08.168 [pool-4-thread-1] DEBUG n.t.c.r.h.HtmlAcceptanceTestReporter - GENERATING HTML REPORT FOR Post void payment:ableToPostVoidPaymentListSuccessfully in af6eb7982d95528e41f62e529faa2a5da7b2bd4c61c517b879fdb35b48fcdae5.html in directory target\site\serenity
08:11:08.174 [pool-4-thread-1] DEBUG n.t.c.r.h.HtmlAcceptanceTestReporter - Generating report in af6eb7982d95528e41f62e529faa2a5da7b2bd4c61c517b879fdb35b48fcdae5.html
08:11:08.184 [pool-4-thread-1] DEBUG n.t.c.r.RequirementsTagProvider - Requirements found:[]
08:11:08.186 [pool-4-thread-1] DEBUG n.t.c.r.RequirementsTagProvider - Requirements found:[]
08:11:08.231 [pool-4-thread-1] DEBUG n.t.c.r.h.HtmlAcceptanceTestReporter - Generated report af6eb7982d95528e41f62e529faa2a5da7b2bd4c61c517b879fdb35b48fcdae5.html in 57 ms
08:11:08.232 [pool-4-thread-1] DEBUG n.t.core.reports.ReportService - Processing test outcome Post void payment:ableToPostVoidPaymentListSuccessfully done
08:11:08.233 [main] DEBUG n.t.core.reports.ReportService - Shutting down executor service
08:11:08.233 [main] DEBUG n.t.core.reports.ReportService - Reports generated in: 75 ms
08:11:08.236 [main] DEBUG n.t.core.reports.ReportService - Generating report for configuration
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.381 sec - in com.restapi.github.features.PostVoidPayment

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- serenity-maven-plugin:1.9.0:aggregate (serenity-reports) @ DemoAPITestingWithSerenityBDD ---
[INFO] current_project.base.dir: C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD
[INFO] Generating test results for 2 tests
[INFO] 0 requirements loaded after 58 ms
[INFO] 0 related requirements found after 60 ms
[INFO] Generating test outcome reports: false
[INFO] Starting generating reports: 109 ms
[INFO] Configured report threads: 40
[INFO] Test results for 2 tests generated in 1792 ms
[INFO]
[INFO] --- maven-failsafe-plugin:2.18.1:verify (default) @ DemoAPITestingWithSerenityBDD ---
[INFO] Failsafe report directory: C:\Users\User\Documents\GitHub\DemoAPITestingWithSerenityBDD\target\failsafe-reports
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 47.009 s
[INFO] Finished at: 2019-01-08T08:11:13+08:00
[INFO] ------------------------------------------------------------------------

```


