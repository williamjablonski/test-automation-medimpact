#FROM ubuntu:16.04
FROM jrei/systemd-ubuntu:20.04
RUN apt-get update
RUN apt-get update && apt-get install -y \
  default-jre \
  default-jdk \
  git \
  maven 

RUN mvn -version
RUN git clone https://github.com/williamjablonski/test-automation-medimpact.git
CMD ls
# Install Google Chrome
RUN apt-get install wget
RUN wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
RUN apt-get install ./google-chrome*.deb --yes
#
#RUN mkdir /Users/admin/Downloads/chromedriver
#RUN 
RUN apt-get install -y unzip libgconf-2-4 google-chrome-stable Xvfb
RUN wget -N http://chromedriver.storage.googleapis.com/2.29/chromedriver_linux64.zip -P ~/Downloads
RUN unzip ~/Downloads/chromedriver_linux64.zip -d ~/Downloads
RUN mv -f ~/Downloads/chromedriver /usr/local/share/
RUN chmod +x /usr/local/share/chromedriver
RUN ln -s /usr/local/share/chromedriver /usr/local/bin/chromedriver
RUN ln -s /usr/local/share/chromedriver /usr/bin/chromedriver
RUN export jenkins_display_param="key : DISPLAY\n value:0:0"
RUN Xvfb :0 -ac -screen 0 1024x768x24 &
RUN cd test-automation-medimpact && git pull origin master && sh ./run.sh