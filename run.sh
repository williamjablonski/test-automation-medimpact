#mvn clean install test -Dcucumber.options=" --format html:target/cucumber  --features src/test/java/features --tags @NewAPITests"
# mvn install -DbaseUrl="https://www.medimpact.com"

# 2021 - NT Run - MEDIMPACT
mvn clean install test -DbaseUrl="https://www.medimpact.com"


# Remote
# INSTALL
# docker pull selenium/standalone-chrome
# RUN
# docker run -d -p 4444:4444 --shm-size="2g" selenium/standalone-chrome:4.0.0-rc-2-prerelease-20210923
# GUIDE
# https://github.com/SeleniumHQ/docker-selenium
# https://www.lambdatest.com/blog/run-selenium-tests-in-docker/
