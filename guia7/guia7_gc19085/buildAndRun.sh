#!/bin/sh
mvn clean package && docker build -t sv.edu.occ.ues.ingenieria.prn335/guia7_gc19085 .
docker rm -f guia7_gc19085 || true && docker run -d -p 9080:9080 -p 9443:9443 --name guia7_gc19085 sv.edu.occ.ues.ingenieria.prn335/guia7_gc19085