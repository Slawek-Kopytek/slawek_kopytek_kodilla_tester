cd C:\Users\slavk\IntelliJ\build\libs
del *.jar
cd ..
cd ..
call gradlew build
cd C:\Users\slavk\IntelliJ\build\libs

IF EXIST *.jar(
    mkdir project copy *.jar project
) ELSE (
    echo Error occurred
)