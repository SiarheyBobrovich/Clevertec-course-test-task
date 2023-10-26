# Задание:
1. Склонировать (удалить .git) или скачать архивом себе проект
2. Создавать ветку feature/{название} от dev
3. Создавать PR в dev на каждый класс
    - Должно получиться 3 PRа
4. Покрыть функционал юнит тестами
5. Смержить всё в dev с удалением ветки(PR должны оставаться в состоянии close)
6. Сделать дополнительное задание, смотрите ниже(Опционально), +1 PR
7. Отправить форму, указав ссылку на репозиторий (форма в задании по тестированию)

## Смотрите javaDoc в интерфейсах и классах для создания тестов:
- [Product.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Fentity%2FProduct.java) - Продукт с идентификатором и датой создания
- [ProductDto.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Fdata%2FProductDto.java) - Минимальный набор данных для создания и модификации продукта
- [InfoProductDto.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Fdata%2FInfoProductDto.java) - Информация о продукте включающая идентификатор
- [ProductService.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Fservice%2FProductService.java) - Интерфейс для работы с продуктами
- [ProductServiceImpl.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Fservice%2Fimpl%2FProductServiceImpl.java) - Реализация [ProductService.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Fservice%2FProductService.java)
- [ProductRepository.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Frepository%2FProductRepository.java) - Интерфейс для хранения продуктов
- [InMemoryProductRepository.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Frepository%2Fimpl%2FInMemoryProductRepository.java) - Реализация [ProductRepository.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Frepository%2FProductRepository.java)
- [ProductMapper.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Fmapper%2FProductMapper.java) - Интерфейс для маппинга
- [ProductMapperImpl.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Fmapper%2Fimpl%2FProductMapperImpl.java) - Реализация [ProductMapper.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Fmapper%2FProductMapper.java)
- [ProductNotFoundException.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Fexception%2FProductNotFoundException.java) - Исключение выпадающее только на сервисном слое

### Тестами должны быть покрыты
1) [ProductServiceImpl.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Fservice%2Fimpl%2FProductServiceImpl.java)
2) [InMemoryProductRepository.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Frepository%2Fimpl%2FInMemoryProductRepository.java)
3) [ProductMapperImpl.java](src%2Fmain%2Fjava%2Fru%2Fclevertec%2Fproduct%2Fmapper%2Fimpl%2FProductMapperImpl.java)

#### После выполнения основного задания будет +:
1) Создать ветку feature/impl
2) Реализовать логику всего функционала
3) Использовать mapstruct
4) Использовать только стрима
5) Сделать PR в dev
6) Смержить в dev с удалением ветки(PR должны оставаться в состоянии close)
