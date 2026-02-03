1. To generate Allure reports, run the following command in your terminal:
   npx allure generate "**/allure-results" -o build/allure-report --open
2. To run tests by tags:
   ./gradlew clean test test -DTAGS=positive
