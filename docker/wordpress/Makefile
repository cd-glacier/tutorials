
all-step: build-dataonly run-dataonly up

build-dataonly:
	docker build -t dataonly .

run-dataonly:
	docker run -it --name dataonly dataonly

up:
	docker-compose up -d

