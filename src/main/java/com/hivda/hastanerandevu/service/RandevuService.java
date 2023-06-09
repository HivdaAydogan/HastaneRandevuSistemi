package com.hivda.hastanerandevu.service;

import com.hivda.hastanerandevu.dto.request.RandevuSaveRequestDto;
import com.hivda.hastanerandevu.exceptions.ErrorType;
import com.hivda.hastanerandevu.exceptions.HastaneRandevuException;
import com.hivda.hastanerandevu.repository.IRandevuRepository;
import com.hivda.hastanerandevu.repository.entity.Randevu;
import com.hivda.hastanerandevu.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class RandevuService extends ServiceManager<Randevu,Long> {
    private final IRandevuRepository repository;
    /**
     * TODO: Bir servisin içinde başka bir servisi kullanmak doğru mudur?
     * Çağırım yapacağınız servis içinde özelleştirilmiş metotlar ve işlemler olabilir,
     * bu özel metotlar datayı manipüle ederken farklı işlemler yapabilir. İşlemleri
     * soyutlama nedeniyle ilgili seviste yapılan işlemleri bilemeyeceğimiz için
     * direkt Repository'e erişmek sakıncalı olacaktır.
     *
     * TODO: Ancak servisler birbirlerini çağırarak loop yaratmamalıdır.
     */
    // private final IDoktorRepository doktorRepository;


    private final DoktorService doktorService;
    private final HastaService hastaService;
    public RandevuService(IRandevuRepository repository,
                          DoktorService doktorService,
                          HastaService hastaService){
        super(repository);
        this.repository = repository;
        this.doktorService = doktorService;
        this.hastaService = hastaService;
    }

    public Randevu save(RandevuSaveRequestDto dto){
        /**
         * TODO: Doktor id kontrol edelim yoksa hata döndürelim
         * TODO: Hasta id kontrol edelim yoksa hata döndürelim
         * TODO: Tarih kontrol edelim mevcut zamandan önce ise hata döndürelim
         */
        if(doktorService.findById(dto.getDoktorid()).isEmpty()) // dto içinden gelen doktor id doktor tablosunda yoksa hata fırlat
            throw new HastaneRandevuException(ErrorType.DOKTOR_BULUNAMADI);
        else if(hastaService.findById(dto.getHastaid()).isEmpty())
            throw new HastaneRandevuException(ErrorType.HASTA_BULUNAMADI);
        /**
         * TODO: ÖDEV Randevu tarihleri Long olarak geldiği için kontrol edilmesi kolay olacaktır.
         * ancak eğer tarihler şöyle iletilse idi nasıl yapılabilirdi?
         * Yıl,Ay,Gün,Saat,Dakika  ???????
         */
        return null;
    }





}
