#!/bin/bash

# Docker Compose ile servisleri başlat
docker compose up -d

# Logları göster
docker compose logs -f 