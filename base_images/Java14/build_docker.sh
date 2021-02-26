#! /bin/bash

TAG="javagroupjava1416:java-14-base"

echo "Start building Java 14 base image"

docker build --pull --rm -f "base_images\Java14\Dockerfile" -t ${TAG} "base_images\Java14"

docker run --rm -it ${TAG}