# Домашнее задание к занятию «1.2. Основы автоматизации» курса Netology.ru "Тестировщик"
## Тема: "Состояние, зависимости, CI"

## Задача:
* выполнение автоматических тестов и настрока CI (ci.appveyor.com);
* обеспечить Code Coverage 100%;
* добавить параметризированный тест.

## Реализация:
* Склонировать репозиторий `git clone https://https://github.com/Matvey75/aqa_1_2.git`
* Перейти в директорию с проектом
* Выполнить команду `./gradlew test jacocoTestReport` (`gradlew.bat test jacocoTestReport`, если запускается из windows)
* Отчет по покрытию кода можно посмотреть в директории `build/reports/jacoco`

## Отчет по выполнению тестов:
[![Build status](https://ci.appveyor.com/api/projects/status/0626n9cw2le9jlt1?svg=true)](https://ci.appveyor.com/project/Matvey75/aqa-1-2)
