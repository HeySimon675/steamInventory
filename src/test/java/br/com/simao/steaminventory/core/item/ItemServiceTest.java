package br.com.simao.steaminventory.core.item;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ItemServiceTest {

    @Mock
    ItemRepository repository;

    ItemService subject;

    @BeforeEach
    public void before() {
        subject = new ItemService(repository);
    }

    @Test
    public void pesquisaItemPorNomeCompletoSucess() {

    }
}