# Kafka

## 1. Docker kafka 실행 및 테스트

```shell
docker-compose up -d
```

### 1-1. 컨테이너 접속


```shell
docker container exec -it local-kafka bash
```

### 1-2. Producer & Consumer Test

```shell
# Producer 실행
kafka-console-producer.sh --bootstrap-server localhost:9092 --topic chat

# Consumer 실행
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic chat
```

## 2. Spring boot Kafka 테스트

