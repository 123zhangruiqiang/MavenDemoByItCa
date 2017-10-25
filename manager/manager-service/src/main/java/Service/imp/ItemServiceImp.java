package Service.imp;

import Mapper.TbItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.TbItem;
import pojo.TbItemExample;
import service.ItemService;

import java.util.List;
@Service
public class ItemServiceImp implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long itemId) {
        //根据主键查询
        //TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        //设置查询条件
        criteria.andIdEqualTo(itemId);
        //执行查询
        List<TbItem> list;
        list = itemMapper.selectByExample(example);
        if ((list != null) && (list.size() > 0)) {
            return list.get(0);
        }
        return null;
    }
}
