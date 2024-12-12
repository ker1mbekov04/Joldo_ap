package com.example.quizz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemaActivity {

    // Вопросы по дорожным знакам
    private static List<QuestionsList> znakQuestion() {
        final List<QuestionsList> questionsList=new ArrayList<>();
        final QuestionsList question1=new QuestionsList(
                "norhoto", // Путь к изображению (пример)
                "Какой знак означает обязательную остановку?",
                "Главная дорога",
                "Движение запрещено",
                "STOP",
                "Ограничение скорости",
                "STOP",
                ""
        );

        final QuestionsList question2=new QuestionsList(
                "norhoto",
                "Какой знак указывает на главную дорогу?",
                "Главная дорога",
                "Пешеходный переход",
                "Ограничение скорости",
                "Движение запрещено",
                "Главная дорога",
                ""
        );

        final QuestionsList question3=new QuestionsList(
                "kirpich",
                "Что означает знак 'Въезд запрещен'?",
                "Можно ехать только направо",
                "Движение запрещено для всех транспортных средств",
                "Парковка запрещена",
                "Ограничение скорости",
                "Движение запрещено для всех транспортных средств",
                ""
        );

        final QuestionsList question4=new QuestionsList(
                "norhoto",
                "Какой знак указывает место перехода пешеходов?",
                "Пешеходный переход",
                "Главная дорога",
                "STOP",
                "Движение запрещено",
                "Пешеходный переход",
                ""
        );

        final QuestionsList question5=new QuestionsList(
                "norhoto",
                "Какой знак указывает на ограничение скорости?",
                "Главная дорога",
                "Ограничение скорости",
                "STOP",
                "Движение запрещено",
                "Ограничение скорости",
                ""
        );

        final QuestionsList question6=new QuestionsList(
                "ustup",
                "Какой это знак?",
                "Главная дорога",
                "STOP",
                "Уступи дорогу",
                "Движение запрещено",
                "Уступи дорогу",
                ""
        );

        final QuestionsList question7=new QuestionsList(
                "no_overtaking",
                "Что означает знак 'Обгон запрещен'?",
                "Можно обгонять только легковые автомобили",
                "Обгон запрещен для всех транспортных средств",
                "Движение запрещено",
                "Ограничение скорости",
                "Обгон запрещен для всех транспортных средств",
                ""
        );

        final QuestionsList question8=new QuestionsList(
                "xxxtec",
                "Какой знак означает запрет парковки?",
                "Остановка запрещена",
                "Движение запрещено",
                "Парковка запрещена",
                "STOP",
                "Парковка запрещена",
                ""
        );

        final QuestionsList question9=new QuestionsList(
                "railroad",
                "Какой это знак?",
                "Главная дорога",
                "STOP",
                "Железнодорожный переезд без шлагбаума",
                "Уступи дорогу",
                "Железнодорожный переезд без шлагбаума",
                ""
        );

        final QuestionsList question10=new QuestionsList(
                "kind",
                "Что означает знак 'Дети'?",
                "Запрещает движение грузовиков",
                "Указывает на детский сад",
                "Внимание, дети!",
                "Движение запрещено",
                "Внимание, дети!",
                ""
        );
        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        // Перемешиваем вопросы
        Collections.shuffle(questionsList);
        return questionsList;
    }

    private static List<QuestionsList> perekrestokQuestion() {
        final List<QuestionsList> questionsList=new ArrayList<>();
        final QuestionsList question1=new QuestionsList(
                "norhoto", // Путь к изображению
                        "Как вы должны действовать, подъезжая к нерегулируемому перекрестку?",
                        "Проехать первым",
                        "Уступить дорогу автомобилям с правой стороны",
                        "Остановиться и уступить дорогу всем",
                        "Проехать вторым",
                        "Уступить дорогу автомобилям с правой стороны",
                        ""
    );

        final QuestionsList question2=new QuestionsList(
                "sfetofor",
                        "Что означает мигающий желтый сигнал светофора?",
                        "Запрещает движение",
                        "Указывает на необходимость остановиться",
                        "Разрешает движение, если путь свободен",
                        "Разрешает движение только направо",
                        "Разрешает движение, если путь свободен",
                        ""
    );

        final QuestionsList question3=new QuestionsList(
                "peshe",
                        "Кто имеет приоритет на нерегулируемом перекрестке?",
                        "Пешеходы",
                        "Транспортные средства",
                        "Мотоциклисты",
                        "Водители грузовиков",
                        "Пешеходы",
                        ""
    );

        final QuestionsList question4=new QuestionsList(
                "norhoto",
                        "Какая основная схема приоритета на нерегулируемом перекрестке?",
                        "Уступить дорогу транспорту слева",
                        "Всегда проезжать первым",
                        "Уступить дорогу транспорту справа",
                        "Проезжать одновременно",
                        "Уступить дорогу транспорту справа",
                        ""
    );

        final QuestionsList question5=new QuestionsList(
                "togolok",
                        "Кто имеет приоритет на круговом перекрестке?",
                        "Транспортные средства, въезжающие на кольцо",
                        "Пешеходы на переходе",
                        "Транспортные средства, движущиеся по кольцу",
                        "Автобусы",
                        "Транспортные средства, движущиеся по кольцу",
                        ""
    );

        final QuestionsList question6=new QuestionsList(
                "tram",
                        "Что вы должны сделать, если на перекрестке движется трамвай?",
                        "Уступить дорогу трамваю",
                        "Проехать первым",
                        "Уступить дорогу только при движении направо",
                        "Уступить дорогу только при движении налево",
                        "Уступить дорогу трамваю",
                        ""
    );

        final QuestionsList question7=new QuestionsList(
                "pedestrian",
                        "Что вы должны сделать, если пешеход начал переходить дорогу на перекрестке?",
                        "Остановиться и пропустить пешехода",
                        "Проехать быстро, чтобы не создавать препятствие",
                        "Уступить дорогу только при движении направо",
                        "Уступить дорогу только на нерегулируемых перекрестках",
                        "Остановиться и пропустить пешехода",
                        ""
    );

        final QuestionsList question8=new QuestionsList(
                "yeild",
                        "Как действовать, если нет знаков приоритета на перекрестке?",
                        "Двигаться быстрее, чтобы пересечь первым",
                        "Уступить дорогу всем автомобилям с правой стороны",
                        "Проехать первым",
                        "Уступить дорогу только пешеходам",
                        "Уступить дорогу всем автомобилям с правой стороны",
                        ""
    );

        final QuestionsList question9=new QuestionsList(
                "ment",
                        "Что делать, если к перекрестку приближается автомобиль с включенными проблесковыми маячками?",
                        "Продолжить движение",
                        "Остановиться и уступить дорогу",
                        "Двигаться быстрее, чтобы освободить перекресток",
                        "Уступить дорогу только при движении налево",
                        "Остановиться и уступить дорогу",
                        ""
    );

        final QuestionsList question10=new QuestionsList(
                "full_stop",
                        "Как вы должны действовать на перекрестке со знаком 'STOP'?",
                        "Остановиться полностью, проверить безопасность, затем продолжить движение",
                        "Замедлиться и продолжить движение",
                        "Проехать, если нет транспорта справа",
                        "Остановиться только при наличии автомобилей",
                        "Остановиться полностью, проверить безопасность, затем продолжить движение",
                        ""
        );
        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        // Перемешиваем список
        Collections.shuffle(questionsList);

        return questionsList;
    }
    private static List<QuestionsList> roadLineQuestion() {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList(
                "sploshnaya", // Путь к изображению
                "Что означает сплошная линия разметки?",
                "Разделение полос для обгона",
                "Запрещает пересечение и обгон",
                "Обозначает парковочную зону",
                "Ограничивает велосипедную дорожку",
                "Запрещает пересечение и обгон",
                ""
        );

        final QuestionsList question2 = new QuestionsList(
                "preryvistaya",
                "Что означает прерывистая линия разметки?",
                "Запрещает обгон",
                "Разрешает пересечение и обгон",
                "Обозначает остановочную линию",
                "Обозначает зону для пешеходов",
                "Разрешает пересечение и обгон",
                ""
        );

        final QuestionsList question3 = new QuestionsList(
                "zebra",
                "Что означает разметка в виде 'зебры'?",
                "Ограничивает движение грузовиков",
                "Обозначает пешеходный переход",
                "Запрещает парковку",
                "Обозначает остановку общественного транспорта",
                "Обозначает пешеходный переход",
                ""
        );

        final QuestionsList question4 = new QuestionsList(
                "twoosplosh",
                "Что означает двойная сплошная линия?",
                "Разделение встречных потоков движения",
                "Ограничение парковки",
                "Обозначение полосы для поворота налево",
                "Разрешение для объезда препятствий",
                "Разделение встречных потоков движения",
                ""
        );

        final QuestionsList question5 = new QuestionsList(
                "stop_linee",
                "Что означает стоп-линия на проезжей части?",
                "Место обязательной остановки",
                "Обозначение парковочной зоны",
                "Обозначение зоны для грузовиков",
                "Обозначение велосипедной дорожки",
                "Место обязательной остановки",
                ""
        );

        final QuestionsList question6 = new QuestionsList(
                "arrow_marking",
                "Что означает разметка с направляющими стрелками на проезжей части?",
                "Указывает направление движения по полосе",
                "Обозначает остановочную линию",
                "Обозначает пешеходный переход",
                "Запрещает обгон",
                "Указывает направление движения по полосе",
                ""
        );

        final QuestionsList question7 = new QuestionsList(
                "norhoto",
                "Как обозначается полоса для движения общественного транспорта?",
                "Желтая прерывистая линия",
                "Белая сплошная линия с надписью 'BUS'",
                "Двойная желтая линия",
                "Зона без разметки",
                "Белая сплошная линия с надписью 'BUS'",
                ""
        );

        final QuestionsList question8 = new QuestionsList(
                "pedestrian_area",
                "Что означает разметка в виде желтой сетки?",
                "Обозначает зону для пешеходов",
                "Ограничивает парковку",
                "Обозначает место пересечения велосипедных дорожек",
                "Указывает на запрет остановки",
                "Обозначает зону для пешеходов",
                ""
        );

        final QuestionsList question9 = new QuestionsList(
                "merge_lines",
                "Что означает сходящиеся линии разметки на проезжей части?",
                "Указывают на сужение дороги",
                "Обозначают парковочную зону",
                "Указывают на разделение потоков движения",
                "Обозначают остановочную линию",
                "Указывают на сужение дороги",
                ""
        );

        final QuestionsList question10 = new QuestionsList(
                "yellow_line",
                "Что означает желтая линия вдоль края проезжей части?",
                "Запрещает остановку и стоянку",
                "Обозначает парковочную зону",
                "Обозначает зону для грузовиков",
                "Ограничивает движение велосипедов",
                "Запрещает остановку и стоянку",
                ""
        );

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        // Перемешиваем список
        Collections.shuffle(questionsList);

        return questionsList;
    }
    private static List<QuestionsList> firstAidQuestion() {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList(
                "cpr", // Путь к изображению
                "Что нужно делать при проведении сердечно-легочной реанимации (СЛР)?",
                "Начать с 30 сжатий груди",
                "Начать с дыхания в рот",
                "Надавливать на живот",
                "Использовать аптечку",
                "Начать с 30 сжатий груди",
                ""
        );

        final QuestionsList question2 = new QuestionsList(
                "norhoto",
                "Что делать при ожоге?",
                "Охладить ожог холодной водой",
                "Нанести масло или крем",
                "Покрыть ожог бинтом без воды",
                "Наложить повязку с йодом",
                "Охладить ожог холодной водой",
                ""
        );

        final QuestionsList question3 = new QuestionsList(
                "fracture",
                "Как поступить при переломе?",
                "Обездвижить поврежденную конечность",
                "Массировать поврежденную конечность",
                "Пытаться самостоятельно вправить кость",
                "Использовать согревающие мази",
                "Обездвижить поврежденную конечность",
                ""
        );

        final QuestionsList question4 = new QuestionsList(
                "norhoto",
                "Что нужно делать при сильном кровотечении?",
                "Наложить жгут выше раны",
                "Оставить рану открытой",
                "Наложить повязку без давления",
                "Покрыть рану ледяным пакетом",
                "Наложить жгут выше раны",
                ""
        );

        final QuestionsList question5 = new QuestionsList(
                "shok",
                "Как помочь при шоке?",
                "Положить пострадавшего в горизонтальное положение",
                "Дать выпить кофе",
                "Использовать горячую грелку",
                "Успокоить пострадавшего, не двигая им",
                "Положить пострадавшего в горизонтальное положение",
                ""
        );

        final QuestionsList question6 = new QuestionsList(
                "choking",
                "Что делать при удушье (заглотил предмет)?",
                "Наклонить человека вперед и дать ему откашляться",
                "Проводить искусственное дыхание",
                "Потрясти человека за плечи",
                "Немедленно вызвать скорую помощь",
                "Наклонить человека вперед и дать ему откашляться",
                ""
        );

        final QuestionsList question7 = new QuestionsList(
                "norhoto",
                "Как выглядит ожог первой степени?",
                "Покраснение и припухлость кожи",
                "Образование пузырей с жидкостью",
                "Темные участки кожи с трещинами",
                "Черные участки кожи",
                "Покраснение и припухлость кожи",
                ""
        );

        final QuestionsList question8 = new QuestionsList(
                "norhoto",
                "Как распознать переохлаждение?",
                "Легкое ознобление и дрожь",
                "Темные круги под глазами и сухая кожа",
                "Потеря сознания и замедленное дыхание",
                "Повышенная температура тела",
                "Потеря сознания и замедленное дыхание",
                ""
        );

        final QuestionsList question9 = new QuestionsList(
                "norhoto",
                "Что делать при подозрении на инсульт?",
                "Немедленно вызвать скорую помощь",
                "Дать пить воду и успокоить пострадавшего",
                "Наложить лед на голову",
                "Попробовать сделать массаж шеи",
                "Немедленно вызвать скорую помощь",
                ""
        );

        final QuestionsList question10 = new QuestionsList(
                "poisoning",
                "Что делать при отравлении химическими веществами?",
                "Немедленно вызвать скорую помощь",
                "Налить пострадавшему много воды для промывания",
                "Дать пострадавшему активированный уголь",
                "Применить горячий компресс",
                "Немедленно вызвать скорую помощь",
                ""
        );

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        // Перемешиваем список
        Collections.shuffle(questionsList);

        return questionsList;
    }
    private static List<QuestionsList> railwayCrossingQuestion() {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList(
                "norhoto", // Путь к изображению
                "Что необходимо делать перед проездом через железнодорожный переезд?",
                "Остановиться, убедиться в безопасности и проехать",
                "Увеличить скорость, чтобы быстрее проехать",
                "Не обращать внимания на сигнализацию",
                "Двигаться только при отсутствии поезда",
                "Остановиться, убедиться в безопасности и проехать",
                ""
        );

        final QuestionsList question2 = new QuestionsList(
                "norhoto",
                "Какой знак предупреждает о железнодорожном переезде?",
                "Желтый круглый знак с поездом",
                "Красный квадрат с буквами 'ЖД'",
                "Треугольный знак с изображением поезда",
                "Знак с перекрестными линиями",
                "Треугольный знак с изображением поезда",
                ""
        );

        final QuestionsList question3 = new QuestionsList(
                "railway_barrier",
                "Что нужно делать, если на железнодорожном переезде опущены шлагбаумы?",
                "Ожидать, пока они поднимутся",
                "Проехать, если нет поезда",
                "Остановиться и ожидать, не нарушая правила",
                "Повернуть назад и искать другой путь",
                "Остановиться и ожидать, не нарушая правила",
                ""
        );

        final QuestionsList question4 = new QuestionsList(
                "train_approaching",
                "Что делать, если вы увидели приближающийся поезд на переезде?",
                "Остановиться и не двигаться до полной остановки поезда",
                "Ускорить движение, чтобы успеть проехать",
                "Продолжить движение без остановки",
                "Постараться объехать переезд",
                "Остановиться и не двигаться до полной остановки поезда",
                ""
        );

        final QuestionsList question5 = new QuestionsList(
                "norhoto",
                "Как правильно пересекать железнодорожные пути?",
                "Только на специально оборудованных переездах",
                "В любом месте, где нет заграждений",
                "На пересечении с железной дорогой, не обращая внимания на сигналы",
                "Ожидая зеленый свет светофора",
                "Только на специально оборудованных переездах",
                ""
        );

        final QuestionsList question6 = new QuestionsList(
                "norhoto",
                "Что означает красный мигающий сигнал светофора на переезде?",
                "Остановка поезда",
                "Запрещено пересекать пути",
                "Поезд только что прошел",
                "Ожидание разрешения для пересечения",
                "Запрещено пересекать пути",
                ""
        );

        final QuestionsList question7 = new QuestionsList(
                "railway_crossing_with_barriers",
                "Какой тип железнодорожного переезда считается наиболее безопасным?",
                "Переезд с шлагбаумами и сигнализацией",
                "Переезд без сигнализации и шлагбаумов",
                "Переезд с одной линией",
                "Переезд, оборудованный только знаками",
                "Переезд с шлагбаумами и сигнализацией",
                ""
        );

        final QuestionsList question8 = new QuestionsList(
                "train_warning_sign",
                "Какой знак предупреждает о приближении поезда?",
                "Знак с изображением поезда и мигающим светом",
                "Круглый желтый знак с изображением поезда",
                "Треугольный красный знак с надписью 'Переезд'",
                "Прямоугольный знак с сигналом",
                "Знак с изображением поезда и мигающим светом",
                ""
        );

        final QuestionsList question9 = new QuestionsList(
                "crossing_without_barriers",
                "Что делать на переезде без шлагбаумов и сигнализации?",
                "Остановиться и внимательно осмотреть путь",
                "Не снижать скорость и продолжить движение",
                "Проехать с максимальной скоростью",
                "Игнорировать знак",
                "Остановиться и внимательно осмотреть путь",
                ""
        );

        final QuestionsList question10 = new QuestionsList(
                "train_emergency_stop",
                "Что делать при экстренной остановке поезда на переезде?",
                "Немедленно выйти и оценить ситуацию",
                "Ожидать восстановления движения и следить за сигнальными знаками",
                "Пройти пешком через переезд, игнорируя правила",
                "Пытаться объехать поезд",
                "Ожидать восстановления движения и следить за сигнальными знаками",
                ""
        );

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        // Перемешиваем список
        Collections.shuffle(questionsList);

        return questionsList;
    }



    // Метод для получения списка вопросов по теме
    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "Znak":
                return znakQuestion();
            case "perekrestok":
                return perekrestokQuestion();
            case "roadLine":
                return roadLineQuestion();
            case "firstHelp":
                return firstAidQuestion();
            case "JD":
                return railwayCrossingQuestion();

        }
        return null;
    }




}
