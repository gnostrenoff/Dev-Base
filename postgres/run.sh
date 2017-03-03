docker rm -f dev-base || true
docker run --name dev-base -d -p 5432:5432 postgres-devbase
