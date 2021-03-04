#! /bin/bash

TAG="javagroupjava1416:java-16-instanceof"

echo "Start building Java 16 instanceof image"

docker build --pull --rm -f "Dockerfile" -t ${TAG} .

docker run --rm -it ${TAG}