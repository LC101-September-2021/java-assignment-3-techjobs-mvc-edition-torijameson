package org.launchcode.techjobs.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.launchcode.techjobs.mvc.controllers.ListController.columnChoices;


/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @GetMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

    // TODO #3 - Create a handler to process a search request and render the updated search view.
    @GetMapping("search/{model}")
    @ResponseBody
    public String displaySearchResults (@PathVariable String model) {

    <form th:action = "@{/search}" method = "get" >
    <label > Name:
  <input type = "text" name = "keyword" th:
        value = "${keyword}" placeholder = "Find by Owner Name & Shop Type" size = "50" >
  <button type = "submit" class="btn btn-info" > Search </button >
                <div th:text="${param.q}">Search Query</div>
  <button type = "submit" class="btn btn-info" > Reset </button >
  </form >

    }

}
