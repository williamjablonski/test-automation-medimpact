#mvn clean install test -Dcucumber.options=" --format html:target/cucumber  --features src/test/java/features --tags @NewAPITests"
# mvn install -DbaseUrl="https://www.medimpact.com"

# 2021 - NT Run - MEDIMPACT
mvn clean install test -DbaseUrl="https://www.medimpact.com"


# Remote
# docker pull selenium/standalone-chrome
# https://www.lambdatest.com/blog/run-selenium-tests-in-docker/
