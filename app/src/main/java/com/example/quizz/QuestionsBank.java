package com.example.quizz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> kgzQuestions() {
        final List<QuestionsList> questionsList = new ArrayList<>();

        // Пример вопроса с фото
        final QuestionsList question1 = new QuestionsList(
                "go_no", // Путь к изображению
                "Какой дорожный знак запрещает движение транспортных средств?",
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
                "jilai",
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
                "give_way",
                "Какой знак означает 'Уступи дорогу'?",
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
                "Какой знак предупреждает о дорожных работах?",
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
                "Что означает знак 'Перекресток'?",
                "Уступи дорогу",
                "Перекресток с круговым движением",
                "Перекресток с равнозначными дорогами",
                "Ограничение скорости",
                "Перекресток с равнозначными дорогами",
                ""));

        questionsList.add(new QuestionsList(
                "slippery_road.png",
                "Что означает данный знак",
                "Движение запрещено",
                "Скользкая дорога",
                "Опасный участок",
                "Уступи дорогу",
                "Скользкая дорога",
                ""));

        questionsList.add(new QuestionsList(
                "bridge",
                "Что означает знак 'Подъемный мост'?",
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
                "bicycle_crossing.png",
                "Какой знак обозначает велосипедный переход?",
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
                "yield",
                "Кто должен уступить дорогу на нерегулируемом перекрестке?",
                "Автомобиль, приближающийся справа",
                "Автомобиль, приближающийся слева",
                "Пешеходы на переходе",
                "Транспорт с меньшим приоритетом",
                "Автомобиль, приближающийся справа",
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
                "crossroad.png",
                "Какой знак предупреждает о приближении к перекрестку с круговым движением?",
                "Знак 'Круговое движение'",
                "Знак 'Уступи дорогу'",
                "Знак 'Движение запрещено'",
                "Знак 'Светофор'",
                "Знак 'Круговое движение'",
                ""
        ));

        questionsList.add(new QuestionsList(
                "stop.png",
                "Что нужно сделать при встрече со знаком 'STOP'?",
                "Полностью остановиться перед стоп-линией",
                "Снизить скорость до 10 км/ч",
                "Остановиться только при наличии других автомобилей",
                "Продолжить движение с осторожностью",
                "Полностью остановиться перед стоп-линией",
                ""
        ));

        questionsList.add(new QuestionsList(
                "overtake.png",
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
                "railroad.png",
                "Какой знак указывает на приближение к железнодорожному переезду без шлагбаума?",
                "Знак с изображением паровоза",
                "Знак 'Уступи дорогу'",
                "Знак 'Движение запрещено'",
                "Знак с изображением автомобиля",
                "Знак с изображением паровоза",
                ""
        ));

        questionsList.add(new QuestionsList(
                "speedlimit.png",
                "Что означает знак ограничения скорости?",
                "Максимально допустимую скорость",
                "Минимально допустимую скорость",
                "Рекомендуемую скорость",
                "Скорость для грузовиков",
                "Максимально допустимую скорость",
                ""
        ));

        questionsList.add(new QuestionsList(
                "priorityroad.png",
                "Что означает знак 'Главная дорога'?",
                "Приоритет проезда на перекрестке",
                "Запрещает обгон",
                "Ограничивает скорость до 40 км/ч",
                "Запрещает поворот налево",
                "Приоритет проезда на перекрестке",
                ""
        ));

        questionsList.add(new QuestionsList(
                "pedestrianzone.png",
                "Что означает знак 'Пешеходная зона'?",
                "Движение транспорта запрещено",
                "Парковка разрешена",
                "Движение разрешено только велосипедам",
                "Разрешен только общественный транспорт",
                "Движение транспорта запрещено",
                ""
        ));

        questionsList.add(new QuestionsList(
                "crosswalk.png",
                "Что обязан сделать водитель, приближаясь к пешеходному переходу?",
                "Пропустить пешеходов",
                "Снизить скорость до 20 км/ч",
                "Остановиться полностью",
                "Подать звуковой сигнал",
                "Пропустить пешеходов",
                ""
        ));

        questionsList.add(new QuestionsList(
                "turn.png",
                "Когда запрещен поворот налево?",
                "При наличии запрещающего знака или разметки",
                "При отсутствии встречного транспорта",
                "На перекрестках с круговым движением",
                "На дорогах с разделительной полосой",
                "При наличии запрещающего знака или разметки",
                ""
        ));

        questionsList.add(new QuestionsList(
                "parking.png",
                "Что означает знак 'Парковка запрещена'?",
                "Стоянка транспортных средств запрещена",
                "Парковка разрешена только ночью",
                "Остановка разрешена на 5 минут",
                "Разрешена парковка только для грузовиков",
                "Стоянка транспортных средств запрещена",
                ""
        ));

        questionsList.add(new QuestionsList(
                "bicycle.png",
                "Что означает знак 'Велосипедная дорожка'?",
                "Дорога предназначена только для велосипедистов",
                "Движение велосипедистов запрещено",
                "Велосипеды должны двигаться по проезжей части",
                "Только пешеходам можно использовать эту зону",
                "Дорога предназначена только для велосипедистов",
                ""
        ));

        questionsList.add(new QuestionsList(
                "slippery.png",
                "Что означает знак с изображением автомобиля и зигзагообразных линий?",
                "Скользкая дорога",
                "Дорога с ограничением скорости",
                "Опасный участок дороги",
                "Обязательная остановка",
                "Скользкая дорога",
                ""
        ));

        questionsList.add(new QuestionsList(
                "bridge.png",
                "Что означает знак с изображением моста?",
                "Узкий мост впереди",
                "Движение запрещено",
                "Пешеходный мост",
                "Разрешен только общественный транспорт",
                "Узкий мост впереди",
                ""
        ));

        questionsList.add(new QuestionsList(
                "stopline.png",
                "Где водитель должен остановиться при наличии знака 'STOP'?",
                "Перед стоп-линией",
                "В пределах перекрестка",
                "На середине дороги",
                "Перед первым встречным транспортом",
                "Перед стоп-линией",
                ""
        ));

        questionsList.add(new QuestionsList(
                "animals.png",
                "Что означает знак с изображением животного?",
                "Дикие животные могут находиться на дороге",
                "Разрешен только сельскохозяйственный транспорт",
                "Движение велосипедов запрещено",
                "Опасный участок дороги",
                "Дикие животные могут находиться на дороге",
                ""
        ));

        questionsList.add(new QuestionsList(
                "busstop.png",
                "Что означает знак 'Остановка автобуса'?",
                "Место остановки общественного транспорта",
                "Парковка разрешена только автобусам",
                "Движение грузовиков запрещено",
                "Станция технического обслуживания",
                "Место остановки общественного транспорта",
                ""
        ));




        questionsList.add(question1);

        // Перемешиваем список
        Collections.shuffle(questionsList);

        return questionsList;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        if ("kgz".equals(selectedTopicName)) {
            return kgzQuestions();
        }
        return Collections.emptyList();
    }
}
