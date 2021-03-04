#! /bin/bash

TAG="javagroupjava1416:java-14-switch"

echo "Start building Java 14 switch image"

docker build --pull --rm -f "Dockerfile" -t ${TAG} .

docker run --rm -it ${TAG}