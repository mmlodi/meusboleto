package com.meusboleto.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meusboleto.dto.AccountDTO;
import com.meusboleto.model.Account;
import com.meusboleto.repository.AccountRepository;

@CrossOrigin
@RestController
public class AccountREST {

    @Autowired
    private AccountRepository accountRepo;

    @Autowired
    private ModelMapper mapper;

    public static List<Account> accounts = new ArrayList<>();
    
    @GetMapping(value = "/accounts/{id}", produces = "application/json;charset=UTF-8")
    public AccountDTO getById(@PathVariable("id") Integer id ){
        Account account = accountRepo.findById(id).get();

        if (account != null){
            return mapper.map(account, AccountDTO.class);
        }else{
            return null;
        }

    }

    @GetMapping(value = "/accounts", produces = "application/json;charset=UTF-8")
    public List<AccountDTO> getAllAccounts(@PathVariable("id") Integer id ){
        List<Account> listaContas = accountRepo.findAll();

        return listaContas.stream().map(e -> mapper.map(e, AccountDTO.class)).collect(Collectors.toList());
    }

    @PostMapping(value = "/accounts", produces = "application/json;charset=UTF-8")
    public AccountDTO inserir(@RequestBody AccountDTO account){
        // salva a Entidade convertida do DTO
        Account c = mapper.map(account, Account.class);
        accountRepo.save(c);      
        // busca o usuário inserido
        Optional<Account> acc = accountRepo.findById(c.getId());
        // retorna o DTO equivalente à entidade
        return mapper.map(acc, AccountDTO.class);
    }
}
