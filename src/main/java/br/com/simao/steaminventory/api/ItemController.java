package br.com.simao.steaminventory.api;

import br.com.simao.steaminventory.core.item.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    @GetMapping("{id}")
    public ResponseEntity<Item> getItem(@PathVariable Integer id) {

        return null;
    }
}
