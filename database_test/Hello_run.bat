@echo off

set APP=Hello

echo Creating bytecode for %APP%

javac %APP%.java

echo Executing... %APP%
echo --------------------

java %APP%

echo -------------------- done
