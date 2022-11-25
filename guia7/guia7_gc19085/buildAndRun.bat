@echo off
call mvn clean package
call docker build -t sv.edu.occ.ues.ingenieria.prn335/guia7_gc19085 .
call docker rm -f guia7_gc19085
call docker run -d -p 9080:9080 -p 9443:9443 --name guia7_gc19085 sv.edu.occ.ues.ingenieria.prn335/guia7_gc19085