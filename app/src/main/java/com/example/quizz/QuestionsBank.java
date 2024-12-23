package com.example.quizz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> testQuestions() {
        final List<QuestionsList> questionsList = new ArrayList<>();

        // Пример вопроса с фото
        final QuestionsList question1 = new QuestionsList(
                "go_no", // Путь к изображению
                "Какой это дорожный знак?",
                "'Ограничение скорости'",
                "Знак 'Движение запрещено'",
                "Знак 'Главная дорога'",
                "Знак 'Пешеходный переход'",
                "Знак 'Движение запрещено'",
                ""
        );
        questionsList.add(new QuestionsList(
                "stop",
                "Какой знак запрещает въезд?",
                "Главная дорога",
                "Уступи дорогу",
                "Движение запрещено",
                "Въезд запрещен",
                "Въезд запрещен",
                ""));
        questionsList.add(new QuestionsList(
                "jiloi",
                "Что обозначает этот знак?",
                "Место для парковки",
                "Пешеходный переход",
                "Жилая зона",
                "Опасный участок",
                "Жилая зона",
                ""));

        questionsList.add(new QuestionsList(
                "norhoto",
                "Какой знак ограничивает скорость?",
                "Пешеходный переход",
                "Ограничение скорости",
                "Движение запрещено",
                "Уступи дорогу",
                "Ограничение скорости",
                ""));

        questionsList.add(new QuestionsList(
                "ustupiznak",
                "Какой означает этот знак?",
                "Стоп",
                "Главная дорога",
                "Уступи дорогу",
                "Движение запрещено",
                "Уступи дорогу",
                ""));

        questionsList.add(new QuestionsList(
                "round",
                "Что обозначает этот знак?",
                "Главная дорога",
                "Ограничение скорости",
                "Круговое движение",
                "Пешеходный переход",
                "Круговое движение",
                ""));

        questionsList.add(new QuestionsList(
                "parkovka",
                "Что обозначает знак с буквой 'P'?",
                "Пешеходная зона",
                "Место для парковки",
                "Остановка запрещена",
                "Зона ремонта",
                "Место для парковки",
                ""));

        questionsList.add(new QuestionsList(
                "full_stop",
                "Что вы должны сделать, увидев этот знак?",
                "Проехать на свой страх и риск",
                "Снизить скорость",
                "Полностью остановиться",
                "Уступить дорогу",
                "Полностью остановиться",
                ""));

        questionsList.add(new QuestionsList(
                "school_zone",
                "Что обозначает этот знак?",
                "Пешеходный переход",
                "Школьная зона",
                "Заправочная станция",
                "Опасный участок",
                "Школьная зона",
                ""));

        questionsList.add(new QuestionsList(
                "jeleznyi",
                "Что обозначает этот знак?",
                "Движение запрещено",
                "Железнодорожный переезд",
                "Парковка запрещена",
                "Опасный участок",
                "Железнодорожный переезд",
                ""));

        questionsList.add(new QuestionsList(
                "road_work",
                "Какой это знак?",
                "Движение запрещено",
                "Дорожные работы",
                "Опасный участок",
                "Главная дорога",
                "Дорожные работы",
                ""));

        questionsList.add(new QuestionsList(
                "one_way",
                "Что обозначает знак 'Одностороннее движение'?",
                "Запрещает поворот",
                "Указывает разрешенное направление движения",
                "Указывает опасный участок дороги",
                "Запрещает стоянку",
                "Указывает разрешенное направление движения",
                ""));

        questionsList.add(new QuestionsList(
                "pedestrian_zone",
                "Что обозначает этот знак?",
                "Пешеходная зона",
                "Запрещено пешеходам",
                "Опасный участок",
                "Ограничение скорости",
                "Пешеходная зона",
                ""));

        questionsList.add(new QuestionsList(
                "crossroads",
                "Что означает этот знак?",
                "Уступи дорогу",
                "Перекресток с круговым движением",
                "Пересечение со второстепенной дорогой",
                "Ограничение скорости",
                "Пересечение со второстепенной дорогой",
                ""));

        questionsList.add(new QuestionsList(
                "slippery_road",
                "Что означает данный знак",
                "Движение запрещено",
                "Скользкая дорога",
                "Опасный участок",
                "Уступи дорогу",
                "Скользкая дорога",
                ""));

        questionsList.add(new QuestionsList(
                "bridge",
                "Что означает данный знак?",
                "Опасный участок дороги",
                "Подъемный мост",
                "Дорожные работы",
                "Перекресток",
                "Подъемный мост",
                ""));

        questionsList.add(new QuestionsList(
                "height_limit",
                "Что означает данный знак?",
                "Ограничение массы",
                "Ограничение скорости",
                "Ограничение высоты",
                "Движение запрещено",
                "Ограничение высоты",
                ""));

        questionsList.add(new QuestionsList(
                "animal",
                "Что обозначает этот знак?",
                "Проезд запрещен",
                "Дикие животные на дороге",
                "Дорожные работы",
                "Опасный участок",
                "Дикие животные на дороге",
                ""));

        questionsList.add(new QuestionsList(
                "bicycle_crossing",
                "Какой это знак?",
                "Пешеходный переход",
                "Велосипедный переход",
                "Опасный участок",
                "Дорожные работы",
                "Велосипедный переход",
                ""));

        questionsList.add(new QuestionsList(
                "miliciya",
                "В данной ситуации водитель автомобиля с включенными проблесковыми маячками'?",
                "Может двигаться только прямо или направо",
                "Может двигаться в любом направлении",
                "Должен ожидать разрешающего сигнала светофора",
                "Другой вариает",
                "Может двигаться в любом направлении",
                ""));

        questionsList.add(new QuestionsList(
                "norhoto.png",
                "Преимущество перед другими участниками движения имеет водитель автомобиля:",
                "Только с включенным проблесковым маячком оранжевого или желтого цвета",
                "Только с включенными проблесковым маячком синего (или ) красного цвета и специальным звуковым сигналом",
                "Любого из перечисленных",
                "Только с включенным проблесковым маячком синего цвета",
                "Только с включенными проблесковым маячком синего (или ) красного цвета и специальным звуковым сигналом",
                ""));
        questionsList.add(new QuestionsList(
                "norhoto",
                "Кто должен уступить дорогу на нерегулируемом перекрестке?",
                "Автомобиль, приближающийся справа",
                "Автомобиль, приближающийся слева",
                "Пешеходы на переходе",
                "Транспорт с меньшим приоритетом",
                "Автомобиль, приближающийся слева",
                ""
        ));

        questionsList.add(new QuestionsList(
                "roundabout",
                "Кто имеет преимущество на круговом движении при наличии знака 'Уступи дорогу'?",
                "Транспорт на круговом движении",
                "Транспорт, въезжающий на круг",
                "Пешеходы на переходе",
                "Автобус с включенным указателем поворота",
                "Транспорт на круговом движении",
                ""
        ));


        questionsList.add(new QuestionsList(
                "full_stop",
                "Что нужно сделать при встрече со знаком 'STOP'?",
                "Полностью остановиться перед стоп-линией",
                "Снизить скорость до 10 км/ч",
                "Остановиться только при наличии других автомобилей",
                "Продолжить движение с осторожностью",
                "Полностью остановиться перед стоп-линией",
                ""
        ));

        questionsList.add(new QuestionsList(
                "norhoto",
                "Когда обгон запрещен?",
                "На пешеходных переходах",
                "На дорогах с одной полосой",
                "При движении в черте города",
                "При отсутствии встречного транспорта",
                "На пешеходных переходах",
                ""
        ));

        questionsList.add(new QuestionsList(
                "kirpich",
                "Что означает знак 'Въезд запрещен'?",
                "Движение транспорта в данном направлении запрещено",
                "Запрещено останавливаться",
                "Разрешено движение только грузовикам",
                "Разрешен въезд только служебному транспорту",
                "Движение транспорта в данном направлении запрещено",
                ""
        ));

        questionsList.add(new QuestionsList(
                "norhoto",
                "Какой знак указывает на приближение к железнодорожному переезду без шлагбаума?",
                "Знак с изображением паровоза",
                "Знак 'Уступи дорогу'",
                "Знак 'Движение запрещено'",
                "Знак с изображением автомобиля",
                "Знак с изображением паровоза",
                ""
        ));


        questionsList.add(new QuestionsList(
                "priorityroad",
                "Что означает знак 'Главная дорога'?",
                "Приоритет проезда на перекрестке",
                "Запрещает обгон",
                "Ограничивает скорость до 40 км/ч",
                "Запрещает поворот налево",
                "Приоритет проезда на перекрестке",
                ""
        ));

        questionsList.add(new QuestionsList(
                "pedestrianzone",
                "Что означает знак 'Пешеходная зона'?",
                "Движение транспорта запрещено",
                "Парковка разрешена",
                "Движение разрешено только велосипедам",
                "Разрешен только общественный транспорт",
                "Движение транспорта запрещено",
                ""
        ));

        questionsList.add(new QuestionsList(
                "crosswalk",
                "Что обязан сделать водитель, приближаясь к пешеходному переходу?",
                "Пропустить пешеходов",
                "Снизить скорость до 20 км/ч",
                "Остановиться полностью",
                "Подать звуковой сигнал",
                "Пропустить пешеходов",
                ""
        ));

        questionsList.add(new QuestionsList(
                "norhoto",
                "Когда запрещен поворот налево?",
                "При наличии запрещающего знака или разметки",
                "При отсутствии встречного транспорта",
                "На перекрестках с круговым движением",
                "На дорогах с разделительной полосой",
                "При наличии запрещающего знака или разметки",
                ""
        ));

        questionsList.add(new QuestionsList(
                "parking",
                "Что означает знак 'Парковка запрещена'?",
                "Стоянка транспортных средств запрещена",
                "Парковка разрешена только ночью",
                "Остановка разрешена на 5 минут",
                "Разрешена парковка только для грузовиков",
                "Стоянка транспортных средств запрещена",
                ""
        ));

        questionsList.add(new QuestionsList(
                "bicycle",
                "Что означает знак 'Велосипедная дорожка'?",
                "Дорога предназначена только для велосипедистов",
                "Движение велосипедистов запрещено",
                "Велосипеды должны двигаться по проезжей части",
                "Только пешеходам можно использовать эту зону",
                "Дорога предназначена только для велосипедистов",
                ""
        ));

        questionsList.add(new QuestionsList(
                "slippery_road",
                "Что означает знак с изображением автомобиля и зигзагообразных линий?",
                "Скользкая дорога",
                "Дорога с ограничением скорости",
                "Опасный участок дороги",
                "Обязательная остановка",
                "Скользкая дорога",
                ""
        ));


        questionsList.add(new QuestionsList(
                "full_stop.png",
                "Где водитель должен остановиться при наличии знака 'STOP'?",
                "Перед стоп-линией",
                "В пределах перекрестка",
                "На середине дороги",
                "Перед первым встречным транспортом",
                "Перед стоп-линией",
                ""
        ));


        questionsList.add(new QuestionsList(
                "busstop",
                "Что означает знак 'Остановка автобуса'?",
                "Место остановки общественного транспорта",
                "Парковка разрешена только автобусам",
                "Движение грузовиков запрещено",
                "Станция технического обслуживания",
                "Место остановки общественного транспорта",
                ""
        ));
        questionsList.add(new QuestionsList(
                "priority_pp",
                "Кто имеет преимущество в движении на нерегулируемом перекрестке?",
                "Автомобиль, движущийся с главной дороги",
                "Автомобиль, движущийся справа",
                "Автомобиль, движущийся быстрее",
                "Автомобиль, находящийся на перекрестке",
                "Автомобиль, движущийся с главной дороги",
                ""
        ));

        questionsList.add(new QuestionsList(
                "pedestrian",
                "Как должен поступить водитель при приближении к пешеходному переходу?",
                "Снизить скорость и уступить дорогу пешеходам",
                "Проехать переход без остановки",
                "Убедиться в отсутствии автомобилей и продолжить движение",
                "Подать звуковой сигнал",
                "Снизить скорость и уступить дорогу пешеходам",
                ""
        ));

        questionsList.add(new QuestionsList(
                "norhoto",
                "Какова максимально разрешенная скорость в черте города, если отсутствуют знаки ограничения?",
                "60 км/ч",
                "40 км/ч",
                "70 км/ч",
                "50 км/ч",
                "60 км/ч",
                ""
        ));

        questionsList.add(new QuestionsList(
                "norhoto",
                "Какое максимальное содержание алкоголя в крови допускается для водителя?",
                "0,0 промилле",
                "0,2 промилле",
                "0,5 промилле",
                "1,0 промилле",
                "0,0 промилле",
                ""
        ));

        questionsList.add(new QuestionsList(
                "crossroad",
                "Что следует делать, если на перекрестке отказал светофор?",
                "Следовать правилам приоритета на нерегулируемых перекрестках",
                "Остановиться и ждать регулировщика",
                "Продолжить движение без остановки",
                "Двигаться с максимальной скоростью, чтобы не создавать помех",
                "Следовать правилам приоритета на нерегулируемых перекрестках",
                ""
        ));

        questionsList.add(new QuestionsList(
                "norhoto",
                "Какое освещение следует использовать при движении в темное время суток на неосвещенной дороге?",
                "Ближний или дальний свет фар",
                "Габаритные огни",
                "Противотуманные фары",
                "Только дальний свет",
                "Ближний или дальний свет фар",
                ""
        ));

        questionsList.add(new QuestionsList(
                "turn",
                "Что нужно сделать перед началом маневра поворота налево?",
                "Убедиться в безопасности и подать сигнал поворота",
                "Пропустить всех пешеходов и автомобили",
                "Резко снизить скорость",
                "Остановиться на обочине",
                "Убедиться в безопасности и подать сигнал поворота",
                ""
        ));

        questionsList.add(new QuestionsList(
                "overtake",
                "Когда разрешается обгон на дороге?",
                "Только если нет встречного движения",
                "Всегда, если водитель уверен в безопасности",
                "На любых участках дороги",
                "Только на прямых участках",
                "Только если нет встречного движения",
                ""
        ));

        questionsList.add(new QuestionsList(
                "norhoto",
                "Где запрещено оставлять транспортное средство?",
                "На пешеходном переходе",
                "На дороге с двухсторонним движением",
                "В местах с односторонним движением",
                "На заправочной станции",
                "На пешеходном переходе",
                ""
        ));

        questionsList.add(new QuestionsList(
                "norhoto",
                "Какой знак следует выставить при вынужденной остановке на проезжей части?",
                "Знак аварийной остановки",
                "Знак ограничения скорости",
                "Знак обгона запрещен",
                "Знак ремонта дороги",
                "Знак аварийной остановки",
                ""
        ));


        questionsList.add(question1);

        // Перемешиваем список
        Collections.shuffle(questionsList);

        return questionsList.subList(0, Math.min(20, questionsList.size()));
    }

    private static List<QuestionsList> testTemaquestions() {
        // Здесь аналогичная логика для другой категории вопросов
        final List<QuestionsList> allTemaQuestionsList = new ArrayList<>();
        // Добавить вопросы...
        Collections.shuffle(allTemaQuestionsList);

        // Выбираем 20 случайных вопросов
        return allTemaQuestionsList.subList(0, Math.min(20, allTemaQuestionsList.size()));
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "test":
                return testQuestions();

        }
        return null;
    }
}