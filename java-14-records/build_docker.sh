#! /bin/bash

TAG="javagroupjava1416:java-14-record"

echo "Start building Java 14 image for Records feature"

docker build --pull --rm -f "Dockerfile" -t ${TAG} .

docker run --rm -it ${TAG}