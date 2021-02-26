#! /bin/bash

TAG="javagroupjava1416:java-15-base"

echo "Start building Java 15 base image"

docker build --pull --rm -f "base_images\Java15\Dockerfile" -t ${TAG} "base_images\Java15"

docker run --rm -it ${TAG}