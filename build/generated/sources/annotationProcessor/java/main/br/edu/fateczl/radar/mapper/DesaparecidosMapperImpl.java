package br.edu.fateczl.radar.mapper;

import br.edu.fateczl.radar.dto.DesaparecidoDTO;
import br.edu.fateczl.radar.dto.DesaparecidoDTO.DesaparecidoDTOBuilder;
import br.edu.fateczl.radar.entity.Desaparecido;
import br.edu.fateczl.radar.entity.Desaparecido.DesaparecidoBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-30T19:55:36-0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 17.0.2 (Eclipse Adoptium)"
)
@Component
public class DesaparecidosMapperImpl implements DesaparecidosMapper {

    @Override
    public Desaparecido toModel(DesaparecidoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DesaparecidoBuilder desaparecido = Desaparecido.builder();

        desaparecido.nomeCompletoDesaparecido( dto.getNomeCompletoDesaparecido() );
        desaparecido.dataEHoraDesaparecimento( dto.getDataEHoraDesaparecimento() );
        desaparecido.dataDeNascimento( dto.getDataDeNascimento() );
        desaparecido.recompensa( dto.getRecompensa() );
        desaparecido.urlFotoPrincipal( dto.getUrlFotoPrincipal() );
        desaparecido.altTxtFotoPrincipal( dto.getAltTxtFotoPrincipal() );
        desaparecido.descricaoDesaparecimento( dto.getDescricaoDesaparecimento() );
        desaparecido.doenca( dto.getDoenca() );
        desaparecido.sexo( dto.getSexo() );
        desaparecido.corDePele( dto.getCorDePele() );
        List<String> list = dto.getFotos();
        if ( list != null ) {
            desaparecido.fotos( new ArrayList<String>( list ) );
        }

        return desaparecido.build();
    }

    @Override
    public DesaparecidoDTO toDTO(Desaparecido model) {
        if ( model == null ) {
            return null;
        }

        DesaparecidoDTOBuilder desaparecidoDTO = DesaparecidoDTO.builder();

        desaparecidoDTO.dataEHoraDesaparecimento( model.getDataEHoraDesaparecimento() );
        desaparecidoDTO.nomeCompletoDesaparecido( model.getNomeCompletoDesaparecido() );
        desaparecidoDTO.dataDeNascimento( model.getDataDeNascimento() );
        desaparecidoDTO.recompensa( model.getRecompensa() );
        desaparecidoDTO.urlFotoPrincipal( model.getUrlFotoPrincipal() );
        desaparecidoDTO.altTxtFotoPrincipal( model.getAltTxtFotoPrincipal() );
        desaparecidoDTO.descricaoDesaparecimento( model.getDescricaoDesaparecimento() );
        desaparecidoDTO.doenca( model.getDoenca() );
        desaparecidoDTO.sexo( model.getSexo() );
        desaparecidoDTO.corDePele( model.getCorDePele() );
        List<String> list = model.getFotos();
        if ( list != null ) {
            desaparecidoDTO.fotos( new ArrayList<String>( list ) );
        }

        return desaparecidoDTO.build();
    }
}
