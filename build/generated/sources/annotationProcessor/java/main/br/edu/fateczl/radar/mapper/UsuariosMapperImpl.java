package br.edu.fateczl.radar.mapper;

import br.edu.fateczl.radar.dto.SignupDTO;
import br.edu.fateczl.radar.dto.SignupDTO.SignupDTOBuilder;
import br.edu.fateczl.radar.entity.Usuario;
import br.edu.fateczl.radar.entity.Usuario.UsuarioBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-30T19:55:37-0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 17.0.2 (Eclipse Adoptium)"
)
@Component
public class UsuariosMapperImpl implements UsuariosMapper {

    @Override
    public Usuario toModel(SignupDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UsuarioBuilder usuario = Usuario.builder();

        usuario.username( dto.getUsername() );
        usuario.password( dto.getPassword() );
        usuario.email( dto.getEmail() );
        usuario.name( dto.getName() );
        usuario.lastname( dto.getLastname() );
        List<String> list = dto.getRoles();
        if ( list != null ) {
            usuario.roles( new ArrayList<String>( list ) );
        }

        return usuario.build();
    }

    @Override
    public SignupDTO toDTO(Usuario model) {
        if ( model == null ) {
            return null;
        }

        SignupDTOBuilder signupDTO = SignupDTO.builder();

        signupDTO.username( model.getUsername() );
        signupDTO.password( model.getPassword() );
        signupDTO.email( model.getEmail() );
        signupDTO.name( model.getName() );
        signupDTO.lastname( model.getLastname() );
        List<String> list = model.getRoles();
        if ( list != null ) {
            signupDTO.roles( new ArrayList<String>( list ) );
        }

        return signupDTO.build();
    }
}
