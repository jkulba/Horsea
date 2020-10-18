package us.kulba.horsea.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import us.kulba.horsea.models.Contact;
import us.kulba.horsea.repositories.ContactRepository;

@RestController
@RequestMapping(value = "/contact")
@Slf4j
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping("/create-contact")
    public ModelMap createContact(@RequestBody Contact contact) {
        log.debug("Creating new contact: " + contact.toString());
        ModelMap model = new ModelMap();

        try {
            model.addAttribute("data", contactRepository.save(contact));
            model.addAttribute("success", true);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            model.addAttribute("success", false);
            model.addAttribute("success", false);
        }
        return model;
    }

}
