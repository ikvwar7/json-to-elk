Приложение пишет логи в JSON формате и отправляет их в ELK.
https://hub.docker.com/r/sebp/elk/ - docker-образ ELK. 
https://github.com/spujadas/elk-docker - исходный код образа.
https://elk-docker.readthedocs.io - описание образа.

Перед запуском:
    sudo sysctl -w vm.max_map_count=262144 (для корректного запуска 
Elasticsearch)

./docker-for-elk/Dockerfile - Dokerfile для создания образа на основе образа sebp/elk.
    RUN rm /etc/logstash/conf.d/30-output.conf - для отмены создания индекса 
log-%{+YYYY.MM.dd} в Elasticsearch
