package org.launchcode.techjobs.mvc.controllers;

import org.launchcode.techjobs.mvc.models.JobData;
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
    //confused about where Model is / where I add atrribute of Model? I asked Elenora and she said you had to add model as an attribute elsewhere but that makes no sense to me
    public String displaySearchResults (@PathVariable Model model){
        model.addAttribute("searchType", searchType);
        model.addAttribute("searchTerm", searchTerm);

        if this.searchTerm.getValue().equals("all")||this.searchTerm.getValue().equals(""){
            return JobData.findAll(<jobs>);
        } else {
            return JobData.findByColumnAndValue(<jobs>;
                    }//isn't <> indicative of an array?

<table>
    <tr th:each="searchType, searchTerm : ${search/model}">
            <td>
                //provided below
    <form th:action = "@{/search}" method = "get" >
    <label > Name:
  <input type = "text" name = "keyword" th:
        value = "${keyword}" placeholder = "Find by Owner Name & Shop Type" size = "50" >
  <button type = "submit" class="btn btn-info" > Search </button >
                <div th:text="${param.q}">Search Query</div>
  <button type = "submit" class="btn btn-info" > Reset </button >
  </form >
                //provided above
                </td>
                </tr>
                </table>


    }


    // I have no idea where to put the two passages into views. Here? but they are html? so confused.

}
