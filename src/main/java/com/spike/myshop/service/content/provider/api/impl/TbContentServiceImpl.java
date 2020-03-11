package com.spike.myshop.service.content.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spike.myshop.commons.domain.TbContent;
import com.spike.myshop.commons.mapper.TbContentMapper;
import com.spike.myshop.service.content.api.TbContentService;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

@Service(version = "${services.versions.content.v1}")
@Transactional(readOnly = true)
public class TbContentServiceImpl implements TbContentService {

    private TbContentMapper tbContentMapper;

    public TbContentServiceImpl(TbContentMapper tbContentMapper) {
        this.tbContentMapper = tbContentMapper;
    }

    @Override
    public PageInfo<TbContent> page(int start, int length, TbContent tbContent) {
        Example example = new Example(TbContent.class);

        PageHelper.offsetPage(start, length);
        PageInfo<TbContent> pageInfo = new PageInfo<>(tbContentMapper.selectByExample(example));
        return pageInfo;
    }
}
