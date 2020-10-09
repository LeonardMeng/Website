/**
 * Created by KanadeM on 2020/10/10
 */
import request from '@/utils/request'

export function helloWorld(data) {
  return request({
    url: 'user/hellowolrd',
    method: 'get',
    data
  })
}
