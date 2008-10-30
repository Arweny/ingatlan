@echo off

set APP=Test

echo Creating bytecode for %APP%

javac %APP%.java

echo Executing... %APP%
echo --------------------

java -cp .;..\sqlite\sqlitejdbc-v053.jar %APP%

echo -------------------- done
