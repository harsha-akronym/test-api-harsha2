# How to run

docker build -t test_api .

docker run -d --restart=always -p 9090:9090 test_api