#! /bin/bash

TAG="javagroupjava1416:java-15-text-blocks"

echo "Start building Java 15 text blocks image"

docker build --pull --rm -f "Dockerfile" -t ${TAG} .

docker run --rm -it ${TAG}